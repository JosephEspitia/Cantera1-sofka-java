/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller04_act04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[][];
        arr= new int[4][5];
        int con =1;
        
        for (int i =0; i<4;i++){
            for (int j =0; j<5;j++){
                arr[i][j]=con;
                if(arr[i][j]<10){
                    System.out.print("0"+arr[i][j]+" ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
                con++;
            }
            System.out.println(" ");
        }
    }
    
}
