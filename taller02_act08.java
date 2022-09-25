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
public class taller02_act08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sabor;
        int cantidad;
        String decoraciones;
        int opc;
        
        Scanner oc = new Scanner(System.in);
        System.out.println("¿Que desea realizar?: ");
        System.out.println("1. Registrar pedido");
        System.out.println("2. Ver tortas disponible");
        System.out.println("3. Ver ventas diarias");
        opc = Integer.parseInt(oc.nextLine());
        
        
        switch (opc) {
            case 1-> {
                Scanner sb = new Scanner(System.in);
                System.out.println("Ingrese el sabor de la torta: ");
                sabor = sb.nextLine();
                
                Scanner ct = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de porciones: ");
                cantidad = Integer.parseInt(ct.nextLine());
                
                Scanner dc = new Scanner(System.in);
                System.out.println("Ingresa las decoraciones: ");
                decoraciones = dc.nextLine();
                
                System.out.println("Se ha registrado un pedido de: Torta de "+ sabor+ " de "+ cantidad+ " porciones"+ " y decoracion de: "+ decoraciones);
            }
            case 2-> {
                System.out.println("Las tortas disponibles son: ");
                System.out.println("Chocolate 20u");
                System.out.println("Cheescake 10u");
                System.out.println("Vainilla 30u");
        }
            case 3-> {
                System.out.println("La venta del día ha sido de 2000");
            }
            
            default->{
                  System.out.println("Opción no valida");
                    }
        }
    }
    
}
