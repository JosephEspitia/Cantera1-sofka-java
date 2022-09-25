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
public class taller01_act_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fullName;
        String mName;
        String pName;
        
        Scanner res = new Scanner(System.in);
        System.out.println("Ingrese su nombre(s) y apellido(s)");
        fullName = res.nextLine();
        
        Scanner mN = new Scanner(System.in);
        System.out.println("Ingrese el nombre(s) y apellidos(s) de su madre");
        mName = mN.nextLine();
        
        Scanner pN = new Scanner(System.in);
        System.out.println("Ingrese el nombre(s) y apellidos(s) de su padre");
        pName = pN.nextLine();
        
        System.out.println("Yo "+ fullName+ ", soy hijo de "+ mName+ " y "+ pName);
    }
    
}
