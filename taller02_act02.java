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
public class taller02_act02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner age = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad= Integer.parseInt(age.nextLine());
        
        if (edad<=18){
            System.out.println("Usted aún es un niño(a)");}
    }
    
}
