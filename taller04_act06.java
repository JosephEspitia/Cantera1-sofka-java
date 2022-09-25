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
public class taller04_act06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,x,n1,n2,fila,columna;
	
        int cuadro[][];
        cuadro = new int[10][10];
	
        int res[][];
        res = new int[10][10];
        
        String fw[];
        fw = new String[10];
	
	fw[0]=" ";
	fw[1]=" ";
	fw[2]=" ";
	fw[3]="F";
	fw[4]="I";
	fw[5]="L";
	fw[6]="A";
	fw[7]="S";
	fw[8]=" ";
	fw[9]=" ";
	
	n1=1;
	n2=1;
	
	System.out.println("                                                 COLUMNAS");
	System.out.println("");
        System.out.print("           ");
	
	for (x=0; x<10; x++) {
            System.out.print(x+"         ");
        
        }
        System.out.println("");
        
	for (i=0;i<10;i++){
            System.out.print(fw[i]+"    "+ i+ "   ");
		
		for (j=0; j<10;j++){
			cuadro[i][j]=n1;
			res[i][j]=n1*n2;
			if (cuadro[i][j]<10) {
                            System.out.print(n2+ " x "+ cuadro[i][j]+ "     ");
			} else {
                            System.out.print(n2+ " x "+ cuadro[i][j]+ "    ");
                        }
                        n2++;
		}
			
                System.out.println(" ");
		n2=1;
		n1++;
        }
        System.out.println("");
	Scanner e=new Scanner(System.in);
        System.out.println("Escriba el numero de la columna a consultar: ");
	columna= e.nextInt();
	
        Scanner w = new Scanner(System.in);
        System.out.println("Escriba el numero de la fila a consultar: ");
	fila = w.nextInt();
        System.out.println("El resultado es: "+res[fila][columna]);
	
    }
    
}
