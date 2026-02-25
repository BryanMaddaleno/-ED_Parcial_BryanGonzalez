package utils;

import java.util.Random;

public class GeneradorDatos {
    /**
     * Genera un arreglo de enteros aleatorios entre 0 y 10,000.
     */
    public static int[] generarArregloAleatorio(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000); // Números de 0 a 9999
        }
        return arr;
    }
}
