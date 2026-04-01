public class Nodo {
    String nombreArchivo;
    int paginas;
    Nodo siguiente;

    public Nodo(String nombreArchivo, int paginas) {
        this.nombreArchivo = nombreArchivo;
        this.paginas = paginas;
        this.siguiente = null;
    }
}

class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    public boolean estaVacia() {
        return frente == null;
    }

    public void push(String nombreArchivo, int paginas) {
        Nodo nuevo = new Nodo(nombreArchivo, paginas);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        fin.siguiente = nuevo;
        fin = nuevo;
    }

    public Nodo pop() {
        if (estaVacia()) {
            throw new RuntimeException("La cola esta vacia");
        }

        Nodo nodoExtraido = frente;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        nodoExtraido.siguiente = null;
        return nodoExtraido;
    }

    public Nodo peek() {
        if (estaVacia()) {
            throw new RuntimeException("La cola esta vacia");
        }
        return frente;
    }

    public int cantidad() {
        int total = 0;
        Nodo actual = frente;
        while (actual != null) {
            total++;
            actual = actual.siguiente;
        }
        return total;
    }

    public String mostrarCola() {
        if (estaVacia()) {
            return "vacia";
        }

        StringBuilder estado = new StringBuilder();
        Nodo actual = frente;
        while (actual != null) {
            estado.append(actual.nombreArchivo);
            if (actual.siguiente != null) {
                estado.append(" -> ");
            }
            actual = actual.siguiente;
        }

        return estado.toString();
    }
}