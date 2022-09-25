/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller04_act03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        int temp[];
        temp = new int[1000];
        
        for(int i =0; i<1000;i++){
            temp[i]=i+1;
            
            for(int j=1;j<=temp[i];j++){
                if((temp[i]%j)==0){
                    cont++;
                }
            }
            if (cont==2){
                System.out.println(temp[i]);
            }
            cont=0;
        }
    }
    
}
