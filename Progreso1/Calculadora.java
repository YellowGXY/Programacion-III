public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 3;

        System.out.println("Calculadora básica");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma:           " + sumar(a, b));
        System.out.println("Resta:          " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División:       " + dividir(a, b));
    }
}
