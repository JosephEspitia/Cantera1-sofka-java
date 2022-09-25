/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class taller03_act05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean on = true;
        String nombre="";
        while (on==true){
            System.out.println("Menu de usuarii");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir");
            
            Scanner p = new Scanner(System.in);
            int opc = p.nextInt();
            
            switch (opc) {
                case 1:
                    Scanner n = new Scanner(System.in);
                    System.out.println("Escriba su nombre: ");
                    nombre = n.nextLine();
                    break;
                    
                case 2:
                    System.out.println("Hola "+nombre+" bienvenido.");
                    break;
                case 3:
                    on=false;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
    
}
