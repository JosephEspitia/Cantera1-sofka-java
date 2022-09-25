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
public class taller02_act05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        int prod;
        String dev;

        Scanner oc = new Scanner(System.in);
        System.out.println("Que actividad desea realizar: ");
        System.out.println("1. Escoger Productos");
        System.out.println("2. Consultar valor de un producto");
        System.out.println("3. Ingresar devolución");
        opc = Integer.parseInt(oc.nextLine());

        switch (opc) {
            case 1 -> {
                System.out.println("1. Pastilla");
                System.out.println("2. Jarabe");
                System.out.println("3. Inyección");
            }
            case 2 -> {
                Scanner pd = new Scanner(System.in);
                System.out.println("Ingrese la referencia del producto a consultar");
                prod = Integer.parseInt(pd.nextLine());

                switch (prod) {
                    case 1 ->
                        System.out.println("La pastilla cuesta $300");
                    case 2 ->
                        System.out.println("El jarabe cuesta $500");
                    case 3 ->
                        System.out.println("La inyeccion cuesta $600");
                    default -> {
                        System.out.println("Opción no valida");
                    }
                }
            }
            case 3 -> {
                Scanner db = new Scanner(System.in);
                System.out.println("Registre la devolucion");
                dev = db.nextLine();

                System.out.println("Se ha registrado la siguiente devolucion: " + dev);
            }
            default -> {
                System.out.println("Opción no valida");
            }

        }

    }

}
