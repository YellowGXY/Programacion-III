import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cadena de caracteres: ");
        String cad = sc.nextLine();

        int caracteres = 0;
        caracteres = cad.length();

        String cadenaInvertida = "";
        for (int i = caracteres - 1; i >= 0; i--) {
            cadenaInvertida += cad.charAt(i);
        }

        System.out.println("\nCadena invertida: " + cadenaInvertida);

    }
}
