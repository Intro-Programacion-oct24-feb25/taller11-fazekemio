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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String cedula;
        String mensaje;
        int a;

        System.out.println("ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingree su numero de cedula");
        cedula = entrada.nextLine();

        System.out.println("Ingrese el numero de servicio");
        System.out.println("1. Planilla de luz");
        System.out.println("2. Valor de inmueble");
        a = entrada.nextInt();
        if (a == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (a == 2) {
                calcularPredio(nombre, cedula);
            }
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorKilowatio;
        double kilowatio;
        double valorPagar;
        String mensaje;

        System.out.println("Ingrese el valor del kilowatio");
        valorKilowatio = entrada.nextDouble();
        System.out.println("Ingrese los kilowatios consumidos");
        kilowatio = entrada.nextDouble();
        valorPagar = kilowatio * valorKilowatio;
        mensaje = String.format("Cliente %s con cedula %s debe cancelar el valor de $%.2f", nombre, cedula, valorPagar);
        System.out.printf("%s", mensaje);
    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double inmueble;
        double valorPredio;
        String mensaje;

        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        valorPredio = inmueble * 2 / 100;
        mensaje = String.format("Cliente %s con cedula %s tiene un inmueble "
                + "valorado en $%.2f y tiene que pagar un predio $%.2f\n",
                nombre, cedula, inmueble, valorPredio);
        System.out.printf("%s", mensaje);

    }
}
    
    

