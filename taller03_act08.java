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
public class taller03_act08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cname1="",cname2="",cname3="",cname4="",cname5="",cname6="",cname7="",cname8="";
        boolean apro1=false,apro2=false,apro3=false,apro4=false,apro5=false,apro6=false,apro7=false,apro8=false;
        boolean on =true;
        
        while(on){
            Scanner oc = new Scanner(System.in);
            System.out.println("Que deseas realizar?");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Consultar estudiante");
            System.out.println("3. salir");
            int opc = oc.nextInt();
            
            switch (opc){
                case 1->{
                    Scanner r = new Scanner(System.in);
                    System.out.println("Seleccione la casilla a utilizar");
                    System.out.println("Casilla 1");
                    System.out.println("Casilla 2");
                    System.out.println("Casilla 3");
                    System.out.println("Casilla 4");
                    System.out.println("Casilla 5");
                    System.out.println("Casilla 6");
                    System.out.println("Casilla 7");
                    System.out.println("Casilla 8");
                    int res = r.nextInt();
                    
                    switch (res){
                        case 1->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname1=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro1=true;
                                case 2->apro1=false;
                            }
                        }
                        case 2->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname2=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro2=true;
                                case 2->apro2=false;
                            }
                        }
                        case 3->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname3=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro3=true;
                                case 2->apro3=false;
                            }
                        }
                        case 4->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname4=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro4=true;
                                case 2->apro4=false;
                            }
                        }
                        case 5->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname5=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro5=true;
                                case 2->apro5=false;
                            }
                        }
                        case 6->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname6=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro6=true;
                                case 2->apro6=false;
                            }
                        }
                        case 7->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname7=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro7=true;
                                case 2->apro7=false;
                            }
                        }
                        case 8->{
                            Scanner cn=new Scanner(System.in);
                            System.out.println("Ingrese el nombre del estudiate: ");
                            cname8=cn.nextLine();
                            Scanner op=new Scanner(System.in);
                            System.out.println("El estudiante aprobo el curso?: ");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int opcA =op.nextInt();
                              switch (opcA){
                                case 1-> apro8=true;
                                case 2->apro8=false;
                            }
                        }
                    }
                                  
                }
                case 2->{
                    Scanner l = new Scanner(System.in);
                    System.out.println("Selecciona el listado a consultar: ");
                    System.out.println("1. Aprobados");
                    System.out.println("2. No aprobados");
                    int opcL=l.nextInt();
                    
                    switch (opcL){
                        case 1->{
                            if (apro1){
                                System.out.println("Nombre: "+cname1+" Aprobado: "+apro1);
                            }
                            if (apro2){
                                System.out.println("Nombre: "+cname2+" Aprobado: "+apro2);
                            }
                            if (apro3){
                                System.out.println("Nombre: "+cname3+" Aprobado: "+apro3);
                            }
                            if (apro4){
                                System.out.println("Nombre: "+cname4+" Aprobado: "+apro4);
                            }
                            if (apro5){
                                System.out.println("Nombre: "+cname5+" Aprobado: "+apro5);
                            }
                            if (apro6){
                                System.out.println("Nombre: "+cname6+" Aprobado: "+apro6);
                            }
                            if (apro7){
                                System.out.println("Nombre: "+cname7+" Aprobado: "+apro7);
                            }
                            if (apro8){
                                System.out.println("Nombre: "+cname8+" Aprobado: "+apro8);
                            }
                        }
                        case 2->{
                            if(!apro1 & cname1!=""){
                                System.out.println("Nombre: "+cname1+" Aprobado: "+apro1);
                            }
                            if(!apro2 & cname2!=""){
                                System.out.println("Nombre: "+cname2+" Aprobado: "+apro2);
                            }
                            if(!apro3 & cname3!=""){
                                System.out.println("Nombre: "+cname3+" Aprobado: "+apro3);
                            }
                            if(!apro4 & cname4!=""){
                                System.out.println("Nombre: "+cname4+" Aprobado: "+apro4);
                            }
                            if(!apro5 & cname5!=""){
                                System.out.println("Nombre: "+cname5+" Aprobado: "+apro5);
                            }
                            if(!apro6 & cname6!=""){
                                System.out.println("Nombre: "+cname6+" Aprobado: "+apro6);
                            }
                            if(!apro7 & cname7!=""){
                                System.out.println("Nombre: "+cname7+" Aprobado: "+apro7);
                            }
                            if(!apro8 & cname8!=""){
                                System.out.println("Nombre: "+cname8+" Aprobado: "+apro8);
                            }
                        
                        }
                    }
                }
                case 3->{
                    on=false;
                }
            }
        }
        
    }
    
}
