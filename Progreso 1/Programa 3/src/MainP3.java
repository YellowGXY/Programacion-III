import java.util.Scanner;

public class MainP3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Impresion impresion = new Impresion();

		int opcion;
		do {
			System.out.println("\n--- MENU DE IMPRESION ---");
			System.out.println("1. Agregar a cola");
			System.out.println("2. Imprimir");
			System.out.println("0. Salir");
			System.out.print("Elige una opcion: ");

			opcion = leerEntero(scanner);

			switch (opcion) {
				case 1:
					String respuesta;
					do {
						System.out.print("Nombre del archivo: ");
						String nombreArchivo = scanner.nextLine().trim();

						if (nombreArchivo.isEmpty()) {
							System.out.println("El nombre no puede estar vacio.");
						} else {
							System.out.print("Numero de paginas: ");
							int paginas = leerEnteroPositivo(scanner);

							impresion.agregarACola(nombreArchivo, paginas);
							System.out.println("Archivo agregado a la cola de espera.");
						}

						System.out.print("Deseas agregar otro archivo? (s/n): ");
						respuesta = scanner.nextLine().trim().toLowerCase();
					} while (respuesta.equals("s"));
					break;

				case 2:
					impresion.imprimirPendientes();
					break;

				case 0:
					System.out.println("Programa finalizado.");
					break;

				default:
					System.out.println("Opcion invalida. Intenta de nuevo.");
			}
		} while (opcion != 0);

		scanner.close();
	}

	private static int leerEntero(Scanner scanner) {
		while (true) {
			String entrada = scanner.nextLine().trim();
			try {
				return Integer.parseInt(entrada);
			} catch (NumberFormatException e) {
				System.out.print("Ingresa un numero valido: ");
			}
		}
	}

	private static int leerEnteroPositivo(Scanner scanner) {
		while (true) {
			int valor = leerEntero(scanner);
			if (valor > 0) {
				return valor;
			}
			System.out.print("Ingresa un numero mayor que 0: ");
		}
	}
}
