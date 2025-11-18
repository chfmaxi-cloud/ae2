package aed;

public class ListaEnlazada<T> {

    ListaEnlazada<Integer> lista = new ListaEnlazada<>();

    private class Nodo {
        private Object dato;
        private Nodo siguiente;
        private Nodo anterior;

    public Nodo(Object dato, Nodo siguiente, Nodo anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato (Object dato){
        this.dato = dato;
    }

    public void setSiguiente (Nodo siguiente){
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente (){
        return siguiente;
    }

    public Nodo getAnterior (Nodo anterior){
        return anterior;
    }

    public void setAnterior(){
        this.anterior = anterior;
    }
    }

    public ListaEnlazada() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int longitud() {
        return lista.longitud();
    }

    public void agregarAdelante(T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void agregarAtras(T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public T obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void eliminar(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public class ListaIterador{
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ListaIterador iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
