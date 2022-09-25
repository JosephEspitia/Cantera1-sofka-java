/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller04_act05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[][];
        arr = new int[3][5];
        int arr2[][];
        arr2 = new int[1][5];
        
        int cont=1;
        int dec=20;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<5;j++){
                arr[i][j]=cont;
                if(arr[i][j]<10){
                    System.out.print("0"+arr[i][j]+" ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
                cont++;
            }
            System.out.println(" ");
        }
        
        for(int i=0; i<1;i++){
            for(int j=0;j<5;j++){
                arr2[i][j]=dec;
                System.out.print(arr2[i][j]+" ");
                dec--;
            }
            System.out.println(" ");
        }
    }
    
}
