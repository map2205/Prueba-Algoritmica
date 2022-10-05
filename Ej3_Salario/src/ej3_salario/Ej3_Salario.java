/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_salario;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ej3_Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int sueldo;
        int h_trabajadas;
        int p_hora;

        System.out.print("Ingresa las horas trabajadas a la semana: ");
        h_trabajadas = teclado.nextInt();

        System.out.print("¿Cuanto cobra por hora?: ");
        p_hora = teclado.nextInt();

        if (h_trabajadas <= 40) {
            sueldo = 4 * (p_hora * h_trabajadas);
        } else {
            //calculo de horas extras
            sueldo = 4 * (h_trabajadas * p_hora + ((h_trabajadas - 40) * (p_hora + (p_hora / 2))));
        }
        System.out.println("Su sueldo es de:  " + sueldo + " euros");

    }

}
