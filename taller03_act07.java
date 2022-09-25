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
public class taller03_act07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String placa1="",placa2="", placa3="",placa4="",placa5="";
        String name1="",name2="", name3="",name4="",name5="";
        String marca1="", marca2="", marca3="",marca4="",marca5="";
        int tel1=0,tel2=0,tel3=0, tel4=0, tel5=0;
        boolean on=true;
        
        while(on){
            Scanner oc = new Scanner(System.in);
            System.out.println("Menú de usuario");
            System.out.println("1.Ingrese vehiculo");
            System.out.println("2. Retirar vehiculo");
            System.out.println("3. Consultar vehiculo");
            System.out.println("4. Salir");
            int opc = oc.nextInt();
            
            switch(opc) {
                case 1->{
                    Scanner ocs = new Scanner(System.in);
                    System.out.println("casilla 1");
                    System.out.println("casilla 2");
                    System.out.println("casilla 3");
                    System.out.println("casilla 4");
                    System.out.println("casilla 5");
                    int opcCas = ocs.nextInt();
                    
                    switch(opcCas){
                        case 1->{
                            Scanner p = new Scanner(System.in);
                            System.out.println("Ingrese la placa: ");
                            placa1=p.nextLine();
                            
                            Scanner m = new Scanner(System.in);
                            System.out.println("Ingrese la marca: ");
                            marca1=m.nextLine();
                            
                            Scanner n = new Scanner(System.in);
                            System.out.println("Ingrese del dueño: ");
                            name1=n.nextLine();
                            
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese el telefono: ");
                            tel1=t.nextInt();
                        }
                         case 2->{
                            Scanner p = new Scanner(System.in);
                            System.out.println("Ingrese la placa: ");
                            placa2=p.nextLine();
                            
                            Scanner m = new Scanner(System.in);
                            System.out.println("Ingrese la marca: ");
                            marca2=m.nextLine();
                            
                            Scanner n = new Scanner(System.in);
                            System.out.println("Ingrese del dueño: ");
                            name2=n.nextLine();
                            
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese el telefono: ");
                            tel2=t.nextInt();
                        }
                          case 3->{
                            Scanner p = new Scanner(System.in);
                            System.out.println("Ingrese la placa: ");
                            placa3=p.nextLine();
                            
                            Scanner m = new Scanner(System.in);
                            System.out.println("Ingrese la marca: ");
                            marca3=m.nextLine();
                            
                            Scanner n = new Scanner(System.in);
                            System.out.println("Ingrese del dueño: ");
                            name3=n.nextLine();
                            
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese el telefono: ");
                            tel3=t.nextInt();
                        }
                           case 4->{
                            Scanner p = new Scanner(System.in);
                            System.out.println("Ingrese la placa: ");
                            placa4=p.nextLine();
                            
                            Scanner m = new Scanner(System.in);
                            System.out.println("Ingrese la marca: ");
                            marca4=m.nextLine();
                            
                            Scanner n = new Scanner(System.in);
                            System.out.println("Ingrese del dueño: ");
                            name4=n.nextLine();
                            
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese el telefono: ");
                            tel4=t.nextInt();
                        }
                            case 5->{
                            Scanner p = new Scanner(System.in);
                            System.out.println("Ingrese la placa: ");
                            placa5=p.nextLine();
                            
                            Scanner m = new Scanner(System.in);
                            System.out.println("Ingrese la marca: ");
                            marca5=m.nextLine();
                            
                            Scanner n = new Scanner(System.in);
                            System.out.println("Ingrese del dueño: ");
                            name5=n.nextLine();
                            
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese el telefono: ");
                            tel5=t.nextInt();
                        }
                    }
                   
                }
                case 2->{
                    Scanner d =new Scanner(System.in);
                    System.out.println("¿Que Vehiculo desea retirar?");
                    System.out.println("1. "+placa1);
                    System.out.println("2. "+placa2);
                    System.out.println("3. "+placa3);
                    System.out.println("4. "+placa4);
                    System.out.println("5. "+placa5);
                    int del = d.nextInt();
                    
                    switch(del){
                        case 1->{
                            placa1="";
                            marca1="";
                            name1="";
                            tel1=0;
                        }
                        case 2->{
                            placa2="";
                            marca2="";
                            name2="";
                            tel2=0;
                        }
                        case 3->{
                            placa3="";
                            marca3="";
                            name3="";
                            tel3=0;
                        }
                        case 4->{
                            placa4="";
                            marca4="";
                            name4="";
                            tel4=0;
                        }
                        case 5->{
                            placa5="";
                            marca5="";
                            name5="";
                            tel5=0;
                        }
                    }
                    System.out.println("Vehiculo retirado");
                }
                case 3->{
                    Scanner b= new Scanner(System.in);
                    System.out.println("Escriba placa a consultar");
                    String busq=b.nextLine();
                    
                    if(busq.equals(placa1)){
                        System.out.println("El vehiculo "+placa1+" con la marca: "+marca1+" a nombre de: "+name1+ " tiene el numero de contacto: "+tel1);
                    } else if(busq.equals(placa2)){
                        System.out.println("El vehiculo "+placa2+" con la marca: "+marca2+" a nombre de: "+name2+ " tiene el numero de contacto: "+tel2);
                    } else if(busq.equals(placa3)){
                        System.out.println("El vehiculo "+placa3+" con la marca: "+marca3+" a nombre de: "+name3+ " tiene el numero de contacto: "+tel3);
                    } else if(busq.equals(placa4)){
                        System.out.println("El vehiculo "+placa4+" con la marca: "+marca4+" a nombre de: "+name4+ " tiene el numero de contacto: "+tel4);
                    } else if(busq.equals(placa5)){
                        System.out.println("El vehiculo "+placa5+" con la marca: "+marca5+" a nombre de: "+name5+ " tiene el numero de contacto: "+tel5);
                    } else {
                        System.out.println("Vehiculo no encontrado");
                    }
                    
                }
                case 4->{
                    on=false;
                }
            }
        }
    }
    
}
