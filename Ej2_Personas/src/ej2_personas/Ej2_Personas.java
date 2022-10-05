/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_personas;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ej2_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int edad, sexo, p_menores, p_mayores, p_masc_mayores, p_fem_menores, p_fem_mayores;
        double porcentaje_mayores, porcentaje_mujeres;

        p_mayores = 0;
        p_menores = 0;
        p_masc_mayores = 0;
        p_fem_mayores = 0;
        p_fem_menores = 0;
        porcentaje_mayores = 0;
        porcentaje_mujeres = 0;

        int i;

        for (i = 1; i <= 50; i++) {
            System.out.print("Persona " + i + " Ingresa la edad: ");

            edad = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Selecciona el sexo.");

            System.out.println("\t1.Hombre");

            System.out.println("\t2.Mujer");

            System.out.print("\t Valor seleccionado: ");

            do {
                sexo = teclado.nextInt();

                teclado.nextLine();

                if (sexo < 1 || sexo > 2) {
                    System.out.print("Valor incorrecto, elija una de las opciones ");
                }
            } while (sexo < 1 || sexo > 2);

            if (sexo == 1 && edad >= 18) {
                p_masc_mayores = p_masc_mayores + 1;
            }

            if (sexo == 2 && edad < 18) {
                p_fem_menores = p_fem_menores + 1;
            }

            if (sexo == 2 && edad >= 18) {
                p_fem_mayores = p_fem_mayores + 1;
            }

            if (edad < 18) {
                p_menores = p_menores + 1;
            } else {
                p_mayores = p_mayores + 1;
            }

            System.out.println();
        }
        porcentaje_mayores = 2.0 * p_mayores;
        porcentaje_mujeres = 2.0 * +(p_fem_mayores + p_fem_menores);
        System.out.println("Cantidad de personas mayores de edad (18+): " + p_mayores);
        System.out.println("Cantidad de personas menores de edad: " + p_menores);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + p_masc_mayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + p_fem_menores);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentaje_mayores);
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + porcentaje_mujeres);
    }

}
