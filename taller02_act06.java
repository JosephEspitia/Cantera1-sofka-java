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
public class taller02_act06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc;
        String moto;
        String obs;
        String fix;
        
        Scanner cp = new Scanner(System.in);
        System.out.println("¿Que desea realizar?: ");
        System.out.println("1. Realizar registro ingreso al taller");
        System.out.println("2. Realizar registro de salida");
        opc = Integer.parseInt(cp.nextLine());
        
        switch (opc){
            case 1-> {
                Scanner mt = new Scanner(System.in);
                System.out.println("Registre la motocicleta ingresada: ");
                moto = mt.nextLine();
                
                Scanner os = new Scanner(System.in);
                System.out.println("Ingrese las observaciones del cliente: ");
                obs = os.nextLine();
                
                System.out.println("Se ha ingresado la moto: "+ moto+ " con las observaciones: "+ obs);
            }
            
            case 2-> {
                Scanner mt = new Scanner(System.in);
                System.out.println("Registre la motocicleta a entregar: ");
                moto = mt.nextLine();
                
                Scanner fx = new Scanner(System.in);
                System.out.println("Ingrese las observaciones de arreglos: ");
                fix = fx.nextLine();
                
                System.out.println("La entrega de la moto: "+ moto+ " Se realiza con los ajustes: "+ fix);
            }
            
            default->{
                System.out.println("Opcion no valida");
                    }
        }
    }
    
}
