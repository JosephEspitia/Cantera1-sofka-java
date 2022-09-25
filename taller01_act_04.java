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
public class taller01_act_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String capital;
        String ctry;
        
        Scanner res = new Scanner(System.in);
        System.out.println("Digite el nombre de su pais: ");
        ctry = res.nextLine();
        
        Scanner resO = new Scanner(System.in);
        System.out.println("Digite el nombre de la Capital");
        capital = resO.nextLine();
        
        System.out.println("La ciudad "+ capital+ " es la capital del país "+ctry);
    }
    
}
