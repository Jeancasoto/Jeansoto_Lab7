/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeansoto_lab7;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeansoto
 */
public class Lugar extends Thread {

    String nombre;
    String clima;
    String extension;
    String habitantes;
    String zona;
    Date fundado;
    Boolean vive;
     ArrayList<Persona> personas= new ArrayList();
     Lugares lug = new Lugares();



    
     
    public Lugar(String nombre, String clima, String extension, String habitantes, String zona, Date fundado, ArrayList ar ) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.habitantes = habitantes;
        this.zona = zona;
        this.fundado = fundado;
        vive = true;
        personas=ar;
    }

   
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Date getFundado() {
        return fundado;
    }

    public void setFundado(Date fundado) {
        this.fundado = fundado;
    }

    public Boolean getVive() {
        return vive;
    }

    public void setVive(Boolean vive) {
        this.vive = vive;
    }


    @Override
    public void run() {
        lug.setVisible(true);
        lug.pack();
        lug.setLocationRelativeTo(lug);
        lug.jt_nombreLugares.setText(nombre);
        
        while (vive) {
            for (int i = 0; i < personas.size(); i++) {
                 if (lug.jt_nombreLugares.getText().equals(personas.get(i).getLugar())) {
             Persona s=personas.get(i);
            Object[] newrow = {s.getNombre(),
                s.getId(),
                s.getLugar(),s.getEdad(),s.getEstatura(),s.getProfesion()};
            DefaultTableModel modelo = (DefaultTableModel) lug.tabla.getModel();
            modelo.addRow(newrow);
            lug.tabla.setModel(modelo);
            personas.remove(personas.get(i));
            }
            }
           

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

        }

    }

}
