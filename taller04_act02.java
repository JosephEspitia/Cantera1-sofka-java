/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller04_act02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numEnt[];
        numEnt = new int[20];
        int n =0;
        int j=0;
        
        for (int i=0; i<20; i++){
            numEnt[i]=(int) Math.floor(Math.random()*100+1);
        }
        
        System.out.print("Numeros pares: ");
        while (n<20){
            if((numEnt[n]%2) ==0){
                System.out.print(numEnt[n]+", ");
            }
            n++;
        }
        System.out.println("");
        System.out.print("Numeros impares: ");
        while(j<20){
            if((numEnt[j]%2) !=0){
                System.out.print(numEnt[j]+", ");
            }
            j++;
        }
        System.out.println("");
    }
    
}
