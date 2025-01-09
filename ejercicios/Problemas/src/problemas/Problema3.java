/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String mensaje;

        System.out.println("ingrese la primera nota");
        nota1 = entrada.nextDouble();

        System.out.println("ingrese la segunda nota");
        nota2 = entrada.nextDouble();

        System.out.println("ingrese la tercera nota");
        nota3 = entrada.nextDouble();

        System.out.println("ingrese la cuarta nota");
        nota4 = entrada.nextDouble();

        mensaje = obtenerPromediosCualitativos(nota1, nota2, nota3, nota4);
        mensaje = String.format("El promedio de las notas: %.2f, %.2f, %.2f, %"
                + ".2f es %s", nota1, nota2, nota3, nota4, mensaje);
        mensaje = mayusculas(mensaje);

        System.out.printf("%s", mensaje);
    }

    public static String obtenerPromediosCualitativos(double a, double b, 
            double c, double d) {
        double promedio;
        String cualitativo = "";
        String mensaje;
        promedio = (a + b + c + d) / 4;
        if (promedio <= 5) {
            cualitativo = "Regular";
        } else {
            if (promedio > 5 && promedio <= 8) {
                cualitativo = "Bueno";
            } else {
                if (promedio > 8 && promedio <= 9) {
                    cualitativo = "Muy Bueno";
                } else {
                    if (promedio > 9 && promedio <= 10) {
                        cualitativo = "Sobre saliente";

                    }
                }

            }
        }
        
        return cualitativo;
    }

    public static String mayusculas(String a) {
        a = a.toUpperCase();
        return a;
    }
}
