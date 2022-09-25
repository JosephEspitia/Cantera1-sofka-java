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
public class taller03_act06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String c1Name="";
        int c1Tel=0;
        String c1Org="";
        String c2Name="";
        int c2Tel=0;
        String c2Org="";
        String c3Name="";
        int c3Tel=0;
        String c3Org="";
        int nTem1;
        int nTem2;
        int nTem3;
        
        boolean on = true;
        
        while (on) {
            System.out.println("Menu de usuario");
            System.out.println("1. Añadir contactos");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            
            Scanner p = new Scanner(System.in);
            int opc = p.nextInt();
            
            switch (opc) {
                case 1 -> {
                    Scanner oc = new Scanner(System.in);
                    System.out.println("¿Que espacio desea guardar?");
                    System.out.println("Casilla 1");
                    System.out.println("Casilla 2");
                    System.out.println("Casilla 3");
                    int opcCas=oc.nextInt();
                    
                    switch (opcCas) {
                        case 1 -> {
                            Scanner na = new Scanner(System.in);
                            System.out.println("Escriba el nombre del nuevo contacto");
                            c1Name = na.nextLine();
                            
                            Scanner te = new Scanner(System.in);
                            System.out.println("Escriba el telefono del nuevo contacto");
                            nTem1 = te.nextInt();
                            
                            Scanner og = new Scanner(System.in);
                            System.out.println("Escriba la organizacion del nuevo contacto");
                            c1Org = og.nextLine();
                            
                            if (nTem1!=c1Tel & nTem1!=c2Tel & nTem1!=c3Tel) {
                                c1Tel = nTem1;
                            } else {
                                System.out.println("No se ha guardado pues el numero ya existe");
                                c1Name="";
                                c1Tel=0;
                                c1Org="";
                            }
                    }
                        case 2 -> {
                            Scanner na1 = new Scanner(System.in);
                            System.out.println("Escriba el nombre del nuevo contacto");
                            c2Name = na1.nextLine();
                            
                            Scanner te1 = new Scanner(System.in);
                            System.out.println("Escriba el telefono del nuevo contacto");
                            nTem2 = te1.nextInt();
                            
                            Scanner og1 = new Scanner(System.in);
                            System.out.println("Escriba la organizacion del nuevo contacto");
                            c2Org = og1.nextLine();
                            
                            if (nTem2!=c1Tel & nTem2!=c2Tel & nTem2!=c3Tel) {
                                c2Tel = nTem2;
                            } else {
                                System.out.println("No se ha guardado pues el numero ya existe");
                                c2Name="";
                                c2Tel=0;
                                c2Org="";
                            }
                    }
                        case 3 -> {
                            Scanner na2 = new Scanner(System.in);
                            System.out.println("Escriba el nombre del nuevo contacto");
                            c3Name = na2.nextLine();
                            
                            Scanner te2 = new Scanner(System.in);
                            System.out.println("Escriba el telefono del nuevo contacto");
                            nTem3 = te2.nextInt();
                            
                            Scanner og2 = new Scanner(System.in);
                            System.out.println("Escriba la organizacion del nuevo contacto");
                            c3Org = og2.nextLine();
                            
                            if (nTem3!=c1Tel & nTem3!=c2Tel & nTem3!=c3Tel) {
                                c3Tel = nTem3;
                            } else {
                                System.out.println("No se ha guardado pues el numero ya existe");
                                c3Name="";
                                c3Tel=0;
                                c3Org="";
                            }
                    }
                      
                    }
                }
                case 2->{
                    Scanner l = new Scanner(System.in);
                    System.out.println("¿Que contacto desea buscar?");
                    String busq = l.nextLine();
                                              
                    if (busq.equals(c1Name)) {
                        System.out.println("El contacto "+c1Name+" tiene el numero: "+c1Tel+" y pertenece a: "+c1Org);
                    } else if (busq.equals(c2Name)) {
                        System.out.println("El contacto "+c2Name+" tiene el numero: "+c2Tel+" y pertenece a: "+c2Org);
                    } else if (busq.equals(c3Name)) {
                        System.out.println("El contacto "+c3Name+" tiene el numero: "+c3Tel+" y pertenece a: "+c3Org);
                    } else {
                        System.out.println("Contacto no Encontrado");
                    }
                    
                }
                
                case 3->{
                    Scanner d=new Scanner(System.in);
                    System.out.println("¿Que usuario desea eliminar?");
                    System.out.println("1. "+c1Name);
                    System.out.println("2. "+c2Name);
                    System.out.println("3. "+c3Name);
                    int del = d.nextInt();
                    
                    switch (del) {
                        case 1 -> {
                            c1Name="";
                            c1Tel=0;
                            c1Org="";
                            System.out.println("Usuario Eliminado");
                    }
                         case 2 -> {
                            c2Name="";
                            c2Tel=0;
                            c2Org="";
                            System.out.println("Usuario Eliminado");
                    }
                          case 3 -> {
                            c3Name="";
                            c3Tel=0;
                            c3Org="";
                            System.out.println("Usuario Eliminado");
                    }
                        
                    }
            }
                case 4 ->{
                    on=false;
                }
                default -> System.out.println("opción no valida");
            }
        }
    }
    
}
