/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutardocente1;

/**
 *
 * @author maria alejandra
 */
public class docenteHC1 extends Docente1 {
    
    private int horastrabajadas;
    private double valorhora;
    private double sueldomeshoras;

    public docenteHC1(String nombreDoc, String facultadDoc, String cadiDoc, int horastrabajadas, double valorhora) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horastrabajadas=horastrabajadas;
        this.valorhora=valorhora;
    }

    

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public void setSueldomeshoras() {
        sueldomeshoras= horastrabajadas*valorhora;
    }

    public double getSueldomeshoras() {
        return sueldomeshoras;
    }

    @Override
    public String toString() {
        return "docenteHC1{" + "horastrabajadas=" + horastrabajadas + ", valorhora=" + valorhora + ", sueldomeshoras=" + sueldomeshoras + '}';
    }

    @Override
    void salariomensual() {
        sueldomeshoras= horastrabajadas*valorhora;
    }
        
         
    
}
