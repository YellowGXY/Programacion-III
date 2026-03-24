public class EjemploArreglos {

    public static void main(String[] args) {
        // Declarar e inicializar un arreglo de enteros
        int[] numeros = {5, 3, 8, 1, 9, 2, 7, 4, 6};

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // Encontrar el mayor y menor elemento
        System.out.println("Mayor: " + encontrarMayor(numeros));
        System.out.println("Menor: " + encontrarMenor(numeros));

        // Calcular el promedio
        System.out.println("Promedio: " + calcularPromedio(numeros));

        // Ordenar el arreglo con burbuja
        ordenarBurbuja(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int num : arr) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] arr) {
        int menor = arr[0];
        for (int num : arr) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static double calcularPromedio(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return (double) suma / arr.length;
    }

    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
