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
public class taller02_act07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peso;
        double estatura;
        double IMC;
        String res;
        
        Scanner ps = new Scanner(System.in);
        System.out.println("Bienvenido, Indique el peso del usuario en kilogramos: ");
        peso = Double.parseDouble(ps.nextLine());
        
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese la estarua del usuario en metros: ");
        estatura = Double.parseDouble(es.nextLine());
    
        IMC = peso/(estatura*estatura);
        
        
        if (IMC < 18.5) {
            res = "bajo peso";
        } else if (IMC>=18.5 & IMC<25.00) {
            res= "normalidad";
        } else if (IMC>=25.00 & IMC<30.00) {
            res = "sobrepeso";
        } else {
            res = "obesidad";
        }
        
        System.out.println("El IMC del usuario es: "+ IMC+ " y se encuentra: "+ res);
    }
    
}
