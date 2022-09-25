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
public class taller02_act03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        String lName;
        int age;
        
        Scanner nm = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        name=nm.nextLine();
        
        Scanner lm = new Scanner(System.in);
        System.out.println("Escribe tu apellido: ");
        lName=  lm.nextLine();
        
        Scanner ag = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        age= Integer.parseInt(ag.nextLine());
        
        if (age>=18) {
            System.out.println(name +" "+lName+ " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");      
        } else {
            System.out.println(name+" "+lName+ " usted es menor de edad, por lo tanto, no puesde entrar a la fiesta, por favor devuélvase a su casa");
        }
    }
    
}
