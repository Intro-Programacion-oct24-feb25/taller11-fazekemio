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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Ingrese 1 para obtener el area de un cuadrado");
        System.out.println("Ingrese 2 para obtener el area de un triangulo");
        System.out.println("Ingrese 3 para obtener el area de un rectangulo");
        num1 = entrada.nextInt();

        if (num1 == 1) {
            obtenerAreaCuadrado();
        } else {
            if (num1 == 2) {
                obtenerAreaTriangulo();
            } else {
                if (num1 == 3) {
                    obtenerAreaRectangulo();
                }

            }

        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;
        double area;
        System.out.println("Ingrese la medida del lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El area del cuadrado de lado: %.2f , es %.2f", 
                lado, area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        double area;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del triangulo de base: %.2f, de altura %.2f,"
                + " es: %.2f", base, altura, area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        double area;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area del rectangulo de lado: %.2f y altura %.2f, "
                + "es: %.2f", base, altura, area);

    }
}