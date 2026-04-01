public class Impresion {
	private final ColaDinamica colaEspera;
	private final ColaDinamica colaImpresos;

	public Impresion() {
		this.colaEspera = new ColaDinamica();
		this.colaImpresos = new ColaDinamica();
	}

	public void agregarACola(String nombreArchivo, int paginas) {
		colaEspera.push(nombreArchivo, paginas);
	}

	public boolean hayPendientes() {
		return !colaEspera.estaVacia();
	}

	public void imprimirPendientes() {
		if (!hayPendientes()) {
			System.out.println("No hay archivos en la cola de espera.");
			return;
		}

		int totalPaginasImpresas = 0;
		System.out.println("\nIniciando impresion...");
		while (!colaEspera.estaVacia()) {
			Nodo archivoActual = colaEspera.pop();
			colaImpresos.push(archivoActual.nombreArchivo, archivoActual.paginas);
			totalPaginasImpresas += archivoActual.paginas;

			System.out.println("Se imprimio: " + archivoActual.nombreArchivo + " (" + archivoActual.paginas + " paginas)");
			System.out.println("Impresiones en cola: " + colaEspera.cantidad());
			System.out.println("Impresiones finalizadas: " + colaImpresos.cantidad());
			System.out.println();
		}

		System.out.println("Total de paginas impresas: " + totalPaginasImpresas);
	}
}
