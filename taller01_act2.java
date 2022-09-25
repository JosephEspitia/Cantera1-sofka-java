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
public class taller01_act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        double estatura;
        
        Scanner res = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = res.nextLine();
        
        Scanner res1 = new Scanner(System.in);
        System.out.println("Ingrese su apellido: ");
        apellido = res1.nextLine();
        
        Scanner res2 = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(res2.nextLine());
        
        Scanner res3 = new Scanner(System.in);
        System.out.println("Ingrese su estatura: ");
        estatura = Double.parseDouble(res3.nextLine());
        
        System.out.println("Usted es: " + nombre + " "+ apellido +", edad: "+edad+ ", estatura: "+estatura);
    }
    
}
