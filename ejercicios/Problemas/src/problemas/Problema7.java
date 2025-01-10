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
public class Problema7 {
    public static void main(String[] args) {
       
        String[] arreglo = obtenerArreglo();
        presentar(arreglo);
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        int i;
        int elementos;

        System.out.println("ingrese el numero de elementos que desea ingresar");
        elementos = entrada.nextInt();

        String[] ciudades = new String[elementos];
        entrada.nextLine();
        
        for (i = 0; i < elementos; i++) {
            System.out.println("Ingrese ciudades del Ecuador");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;

    }
    public static void presentar(String arreglo[]){
        String cadena = "Valores de 4 o 5 caracteres:\n";
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i].length() == 4 || arreglo[i].length() == 5){
                cadena = String.format("%s%s\n", cadena, arreglo[i]);
                
        
            }
        }
        System.out.printf("%s", cadena);
    }
}