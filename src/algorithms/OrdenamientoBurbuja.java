package algorithms;

public class OrdenamientoBurbuja {
    
    public static void iterativo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio (swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void recursivo(int[] arr, int n) {
        // Caso base: si el tamaño del arreglo es 1, ya está ordenado
        if (n == 1) return;

        // Una pasada completa de la "burbuja"
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Llamada para el resto del arreglo (excluyendo el último elemento ya fijado)
        recursivo(arr, n - 1);
    
    }

}
