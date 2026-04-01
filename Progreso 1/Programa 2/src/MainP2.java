import java.util.Scanner;

public class MainP2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una palabra o frase: ");
		String texto = scanner.nextLine();

		Nodo nodoBase = new Nodo(0);
		Nodo.PilaDinamica pila = nodoBase.new PilaDinamica();
		for (int i = 0; i < texto.length(); i++) {
			pila.push(texto.charAt(i));
		}

		StringBuilder invertidaBuilder = new StringBuilder();
		while (!pila.estaVacia()) {
			invertidaBuilder.append((char) pila.pop());
		}

		String invertida = invertidaBuilder.toString();
		System.out.println("Cadena invertida: " + invertida);

		scanner.close();
	}
}
