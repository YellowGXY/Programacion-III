import java.util.EmptyStackException;

public class Nodo {
    int datos;
    Nodo siguiente;

    public Nodo(int datos) {
        this.datos = datos;
        this.siguiente = null;
    }

    public class PilaDinamica {
        private Nodo top;
        public PilaDinamica() {
            this.top = null;
        }

        public boolean estaVacia(){
            return top == null;
        }

        public void push(int datos) {
            Nodo nuevo = new Nodo(datos);
            nuevo.siguiente = top;
            top = nuevo;
        }

        public int pop() {
            if (estaVacia()) {
                throw new EmptyStackException();
            }
            int valor = top.datos;
            top = top.siguiente;
            return valor;
        }

        public int peek() {
            if (estaVacia()) {
                throw new RuntimeException("La pila está vacía");
            }

            return top.datos;
        }
    }
}