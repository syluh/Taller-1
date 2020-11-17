/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1;

import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
       
          //Declaración de las variables
          double m, cm, km, pi ,pu;
          
          m = 0; cm = 0; km = 0; pi = 0; pu = 0;
           System.out.println("***Programa que mertime la conversion de metros en:centimetros-kilomtros-pies y pulgadas***");
           System.out.println("");
           
           //Lectura de datos
           System.out.println("Ingrese la cantidad en metros");
           m = leer.nextDouble();
           
           //Proceso
           
           cm = m * 100;
           km = m / 1000;
           pi = m * 3.28;
           pu = m * 39.37;
           
           //Salida de datos
           System.out.println("La conversión en centimetros es: " +cm);
           System.out.println("La conversión en kilometros es: " +km);
           System.out.println("La conversión en pies es: " +pi);
           System.out.println("La conversión en pulgadas es: " +pu);
                   
    }
    
}
