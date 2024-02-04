
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Recorremos la lista desde el principio hasta el penúltimo elemento
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Suponemos que el elemento actual es el más pequeño

            // Buscamos el índice del elemento más pequeño en el subarray no ordenado (empezamos en i+1, ya que de i hacia atrás
            // ya está ordenado
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Actualizamos el índice del elemento más pequeño
                }
            }

            // Intercambiamos el elemento más pequeño encontrado con el elemento en la posición i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Array desordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\nArray ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
