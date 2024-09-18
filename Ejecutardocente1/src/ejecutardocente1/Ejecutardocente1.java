/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutardocente1;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class Ejecutardocente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreDoc;
        String facultadDoc;
        String cadiDoc;
        int horastrabajadas;
        double valorhora;
        double sueldobasico;
        int cantrabgrado;
        int tipo;
        
        Scanner entra= new Scanner(System.in);
        System.out.println("ingresa tu nombre");
                nombreDoc= entra.next();
        System.out.println("ingresa tu facultad");
                facultadDoc=entra.next();
        System.out.println("ingresa tu cadi");
                cadiDoc=entra.next();
                
        System.out.println("que tipo de docente eres: hc=1, tco=2");
                tipo=entra.nextInt();
                
        switch(tipo){
            case 1:
                System.out.println("ingresa las horas trabajadas");
                        horastrabajadas=entra.nextInt();
                System.out.println("ingresa el valor de la hora trabajada");
                        valorhora=entra.nextDouble();
                docenteHC1 profesor1= new docenteHC1(nombreDoc, facultadDoc, cadiDoc, horastrabajadas, valorhora);
                
                profesor1.setNombreDoc(nombreDoc);
                profesor1.setFacultadDoc(facultadDoc);
                profesor1.setCadiDoc(cadiDoc);
                                
                profesor1.setHorastrabajadas(horastrabajadas);
                profesor1.setValorhora(valorhora);
                profesor1.setSueldomeshoras();
                
                System.out.println(profesor1.toString());
                
                break;
                
            case 2:
                System.out.println("ingrense su sueldo basico");
                sueldobasico=entra.nextDouble();
                System.out.println("ingrese la cantidad de trabajos de grado");
                cantrabgrado=entra.nextInt();
                
                docenteTCO1 profesor2=new docenteTCO1(nombreDoc, facultadDoc, cadiDoc, sueldobasico, cantrabgrado);
                
                profesor2.setNombreDoc(nombreDoc);
                profesor2.setFacultadDoc(facultadDoc);
                profesor2.setCadiDoc(cadiDoc);

                profesor2.setSueldobasico();
                profesor2.setCantrabgrado();
                profesor2.setValorhoraasesor();
                
                
                System.out.println(profesor2.toString());
                
                break;
                
        }
                
    }  
    
}
