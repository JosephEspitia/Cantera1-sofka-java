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
public class taller04_act01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numEnt[];
        numEnt=new int[5];
        for (int i =0; i<5;i++){
            Scanner e = new Scanner(System.in);
            System.out.println("Ingresa casilla "+i);
            numEnt[i]=e.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.println("["+i+"] = "+numEnt[i]);
        }
    }
    
}
