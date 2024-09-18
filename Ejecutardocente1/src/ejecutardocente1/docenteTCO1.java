/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutardocente1;

/**
 *
 * @author maria alejandra
 */
public class docenteTCO1 extends Docente1 {
    private double sueldomensual;
    private int cantrabgrado;
    private double valorhoraasesor;
    private double asesoriadoc;
    private double sueldobasico;

    public docenteTCO1(String nombreDoc, String facultadDoc, String cadiDoc, double sueldobasico, int cantrabgrado) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.sueldobasico=sueldobasico;
        this.cantrabgrado=cantrabgrado;
    }

    
    
        
    public void setSueldobasico() {
        this.sueldobasico = sueldobasico;
    }

    public void setCantrabgrado() {
        this.cantrabgrado = cantrabgrado; 
    }

    public void setValorhoraasesor() {
        valorhoraasesor=sueldobasico/240;
    }

    public double getSueldomensual() {
        return sueldomensual;
    }
@Override
    public String toString() {
        return "docenteTCO1{" + "sueldomensual=" + sueldomensual + ", cantrabgrado=" + cantrabgrado + ", valorhoraasesor=" + valorhoraasesor + ", asesoriadoc=" + asesoriadoc + ", sueldobasico=" + sueldobasico + '}';
    }
    @Override
    void salariomensual() {
        asesoriadoc=cantrabgrado*valorhoraasesor;
        sueldomensual=sueldobasico+asesoriadoc;
    }
    
    
}
