/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uis.sofkau;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author JOSEPH
 */
public class taller02_act09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc;
        double base;
        double altura;
        double area;
        
        Scanner oc = new Scanner(System.in);
        System.out.println("Elija el tipo de figura: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Trapecio");
        opc = Integer.parseInt(oc.nextLine());
        
        switch (opc) {
            case 1->{
                Scanner al = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		altura = Double.parseDouble(al.nextLine());
                
		Scanner bs = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		base = Double.parseDouble(bs.nextLine());
                
                area = (base*altura)/2;
                
		System.out.println("El área del triangulo es: "+ area);
            }
            case 2-> {
                Scanner al = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		altura = Double.parseDouble(al.nextLine());
                
		Scanner bs = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		base = Double.parseDouble(bs.nextLine());
                
                area = (base*altura);
                
		System.out.println("El área del rectangulo es: "+ area);
            }
            case 3-> {
                Scanner al = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		altura = Double.parseDouble(al.nextLine());
                
		Scanner bs = new Scanner(System.in);
                System.out.println("Ingrese valor de la base: ");
		base = Double.parseDouble(bs.nextLine());
                
                area = (base*altura)/2;
                
		System.out.println("El área del trapecio es: "+ area);
            }
            default-> {
                System.out.println("Opcion no valida");
            }
        }
    }
    
}
