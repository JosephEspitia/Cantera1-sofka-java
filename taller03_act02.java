/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller03_act02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i =10; i>1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
             for(int h=10; h>=i; h--){
                    System.out.print("*");
                }
            System.out.println("");
        }
    }
    
}
