/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutardocente1;

/**
 *
 * @author maria alejandra
 */
abstract class Docente1 {
    abstract void salariomensual();
        protected String nombreDoc;
        protected String facultadDoc;
        protected String cadiDoc;

    public Docente1(String nombreDoc, String facultadDoc, String cadiDoc) {
        this.nombreDoc = nombreDoc;
        this.facultadDoc = facultadDoc;
        this.cadiDoc = cadiDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public void setFacultadDoc(String facultadDoc) {
        this.facultadDoc = facultadDoc;
    }

    public void setCadiDoc(String cadiDoc) {
        this.cadiDoc = cadiDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public String getFacultadDoc() {
        return facultadDoc;
    }

    public String getCadiDoc() {
        return cadiDoc;
    }
            
        
    
}
