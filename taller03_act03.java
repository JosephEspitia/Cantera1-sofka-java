/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

/**
 *
 * @author JOSEPH
 */
public class taller03_act03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        int cont02=2;
        int num=10;
        String elm="*";
        String esp=" ";
        
        System.out.println("           *");
        for(int i=1; i<=10; i++){
            while (cont<=i) {
                elm=elm+"*";
                cont++;
            }
            while(cont02<=num){
                esp=esp+" ";
                cont02++;
            }
            System.out.println(esp+elm);
            cont--;
            num--;
            cont02=1;
            esp="";
        }
        for (int j=1; j<=3; j++) {
            if (j<=2) {
                System.out.println("          ***       ");
            } else {
                System.out.println("         *****");
            }
            System.out.println("        *******");
        }
    }
    
}
