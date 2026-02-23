package algorithms;

public class BusquedaLineal {
    
    public static long iterativo(int[] arr, int busqueda) {
    for (int i = 0; i < arr.length; i++) {
            if (arr[i] == busqueda) {
                return i; // Elemento encontrado
            }
        }
        return -1; // No se encontró
    }

        public static long recursivo(int[] arr, int busqueda,int indice) {
        // Caso base 1: El índice llegó al final (no encontrado)
        if (indice >= arr.length) {
            return -1;
        }
        // Caso base 2: Encontramos el valor
        if (arr[indice] == busqueda) {
            return indice;
        }
        // Llamada recursiva: Pasamos al siguiente índice
        return recursivo(arr, busqueda, indice + 1);
    }


}
