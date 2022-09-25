/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.uis.sofkau;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class SofkaU {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
      Scanner res = new Scanner(System.in);
      System.out.println("Ingrese su nombre: ");
      String name = res.nextLine();
      
      Scanner res2 = new Scanner(System.in);
      System.out.println("Ingrese su apellido: ");
      String apellido = res2.nextLine();
      
      System.out.println("su nombre es: "+ name+ " "+ apellido);
      
        
       
        
    }
}
