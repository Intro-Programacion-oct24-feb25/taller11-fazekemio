/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        
        double media = mediaAritmetica(informacion);
        double desviacion = desviacionEstandar(informacion, media);
        
        System.out.printf("La media del arreglo es: %.2f\n", media);
        System.out.printf("La desviación estandar del arreglo es: "
                + "%.4f\n", desviacion);
        
    }
    
    public static double mediaAritmetica(int [] media) {
        
        int suma = 0;
        double promedio;
        
        for (int i = 0; i < media.length; i++) {
            suma = suma + media[i];
        }
        
        promedio = suma/media.length;
        
        return promedio;
    }
    
    public static double desviacionEstandar(int[] arreglo, double media){
        double suma = 0;
        double desviacion;
        
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + Math.pow(arreglo[i] - media, 2);
        }
        
        desviacion = Math.sqrt(suma/arreglo.length);
        
        return desviacion;
    }
    
}
