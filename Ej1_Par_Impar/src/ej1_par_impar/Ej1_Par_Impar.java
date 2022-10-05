/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_par_impar;

import java.util.Scanner;

/**
 *
 * @author marce
 * 
 * Escriba un algoritmo que lea un número entero y determine si es par o impar.
 * Si es par, que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero.
 * Si es impar, que escriba todos los impares de manera descendiente desde si sí mismo hasta el uno.
 * Utilice la instrucción LEER NUMERO al inicio del programa para cargar un número en la variable NUMERO.
 */
public class Ej1_Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("LEER NUMERO --->");
        
        int numeroEntrada=teclado.nextInt();
           
        if(numeroEntrada %2==0){ 
             System.out.println("EL NUMERO "+ numeroEntrada+" ES PAR");
            // bucle descendiente de nº par
            int i;           
            for(i=numeroEntrada; i>=0; i--){
                    System.out.println(i);
            }
            
        }else{
            System.out.println("EL NUMERO "+ numeroEntrada+" ES IMPAR");            
            // bucle descendiente de nº impar
            for(int i=numeroEntrada; i>=1; i--){
               if (i%2 !=0){
                   System.out.println(i);
               }
            }
        }
        
        
    }
    
}
