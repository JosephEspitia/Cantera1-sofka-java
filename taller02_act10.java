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
public class taller02_act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int titularOpc;
        String titular;
        double cantidad;
        double ingreso;
        double retiro;
        int opc;
        
        titular = "";
        cantidad= 0;
        
        Scanner oct = new Scanner(System.in);
        System.out.println("Por favor identifiquese: ");
        System.out.println("1. Juan Perez");
        System.out.println("2. María Jímenez");
        System.out.println("3. Orlando Meza");
        titularOpc = Integer.parseInt(oct.nextLine());
        
        switch (titularOpc) {
            case 1-> {
                titular = "Juan Perez";
                cantidad = 1000;
            }
            case 2-> {
                titular = "María Jimenez";
                cantidad = 2000;
            }
            case 3-> {
                titular = "Orlando Meza";
                cantidad = 3000;
            }
            default->{
                System.out.println("Opcion no valida");
                    }
        }
        
        System.out.println("Bienvenido(a) "+ titular+" que desea realizar: ");
        Scanner oc = new Scanner(System.in);
        System.out.println("1. Ingresos");
        System.out.println("2. Retiros");
        System.out.println("3. Consultar");
        opc= Integer.parseInt(oc.nextLine());
        
        switch (opc) {
            case 1->{
                Scanner ig = new Scanner(System.in);
                System.out.println("Indique la cantidad a ingresar: ");
                ingreso = Double.parseDouble(ig.nextLine());
                if (ingreso<0) {
                    System.out.println("La cantidad ingresada es incorrecta, intente de nuevo");
                } else {
                    System.out.println("Se ha ingresado "+ ingreso+ " a su cuenta "+ "su nuevo saldo es: "+ (cantidad+ingreso));
                }
            }
            case 2->{
                Scanner rt = new Scanner(System.in);
                System.out.println("Indique la cantidad a retirar");
                retiro = Double.parseDouble(rt.nextLine());
                if (retiro>cantidad) {
                    System.out.println("La cantidad seleccionada excede sus fondos intente de nuevo");
                }else {
                    System.out.println("Ha retirado "+ retiro+ " su nuevo saldo es: "+ (cantidad-retiro));
                }
            }
            case 3->{
                System.out.println("Su saldo actual es: "+cantidad);
            }
            default->{
               System.out.println("Opcion no valida");
                    }
        }
    }
    
}
