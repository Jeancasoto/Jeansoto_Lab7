/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeansoto_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jeansoto
 */
public class admin {
    private File archivo;
    private ArrayList<Persona> list;

    public admin(String ruta) {
       this.archivo = new  File(ruta);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Persona> getList() {
        return list;
    }

    public void setList(ArrayList<Persona> list) {
        this.list = list;
    }
    
    public void setPersona(Persona p){
    this.list.add(p);
    }
    
    public void escribirArchivo(){
    FileOutputStream fw = null;
    ObjectOutputStream bw = null;
    
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona t : list) {
                bw.writeObject(t);
            }
        } catch (Exception ex) {
        } finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }
    
    
    }
    
    public void cargarArchivo(){
        try {
            list = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Persona) objeto.readObject())!=null){
                    list.add(temp);
                    }
                } catch (EOFException e) {
                    //Encontro final del archivo
                }
                objeto.close();
                entrada.close();
                //fin if
            }
        } catch (Exception e) {
            
        }
    
    }
    
    
}
