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
public class taller02_act04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opc;
        int pelicula;
        String recibido;

        Scanner op = new Scanner(System.in);
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Consultar peliculas");
        System.out.println("2. Alquilar pelicula");
        System.out.println("3. Recibir pelicula");
        opc = Integer.parseInt(op.nextLine());

        switch (opc) {
            case 1 -> {
                System.out.println("Las peliculas disponibles son: ");
                System.out.println("1. Rey león");
                System.out.println("2. Buscando a nemo");
                System.out.println("3. 101 Dalmatas");
                System.out.println("4. Lylo y Stich");
            }
            case 2 -> {
                Scanner pl = new Scanner(System.in);
                System.out.println("Ingrese el numero de la pelicula que desea alquilar: ");
                pelicula = Integer.parseInt(pl.nextLine());
                
                switch (pelicula) {
                    case 1 -> System.out.println("Haz alquilado el rey león");
                    case 2 -> System.out.println("Haz alquilado Buscando a nemo");
                    case 3 -> System.out.println("Haz alquilado el 101 Dalmatas");
                    case 4 -> System.out.println("Haz alquilado Lylo y Stich");
          
                }
            }
            case 3->{
                Scanner deb = new Scanner(System.in);
                System.out.println("Que pelicula se esta recepcionando: ");
                pelicula= Integer.parseInt(deb.nextLine());
                
                switch (pelicula) {
                    case 1 -> System.out.println("Rey León");
                    case 2 -> System.out.println("Buscando a nemo");
                    case 3 -> System.out.println("101 dalmatas");
                    case 4 -> System.out.println("Lylo y Stich");
                }
                Scanner rc = new Scanner(System.in);
                System.out.println("Describa la recepción de la pelicula: ");
                recibido= rc.nextLine();
                
                System.out.println("Ha registrado los siguientes comentarios: "+ recibido);
            }
           

        }

    }

}
