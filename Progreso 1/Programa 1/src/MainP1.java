import java.util.Scanner;

public class MainP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa n: ");
        int n = scanner.nextInt();

        long operacionesk = 0;
        long operacionesi = 0;
        long operacionesj = 0;

        for (int i = 0; i < n; i++) {
            operacionesi++;
            for (int j = 0; j < n; j++) {
                operacionesj++;
                for (int k = 0; k < n; k++) {
                    operacionesk++;
                }
            }
        }

        System.out.println("Operaciones realizadas en i: " + operacionesi);
        System.out.println("Operaciones realizadas en j: " + operacionesj);
        System.out.println("Operaciones realizadas en k: " + operacionesk);

    }
}
