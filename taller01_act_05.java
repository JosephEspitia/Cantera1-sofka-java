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
public class taller01_act_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String petName;
        int petAge;
        String petType;
        String name;

        Scanner res = new Scanner(System.in);
        System.out.println("Ingrese nombre de mascota: ");
        petName = res.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.println("Ingrese edad de mascota: ");
        petAge = Integer.parseInt(age.nextLine());

        Scanner type = new Scanner(System.in);
        System.out.println("Ingrese tipo de mascota: ");
        petType = type.nextLine();

        Scanner na = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        name = na.nextLine();
        
        System.out.println(petName+ " es un(a) "+ petType+ ", el cual, tiene "+ petAge+ " años de edad y "+ name+ " es actualmente su dueño(a).");
    }

}
