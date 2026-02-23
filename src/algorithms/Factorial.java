package algorithms;

public class Factorial {
    
    public static long iterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long recursivo(int n) {
        if (n <= 1) {
            return 1; // Caso base
        }
        return n * recursivo(n - 1);
    }

}
