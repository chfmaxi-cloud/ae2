package aed;
import java.util.*;

import aed.ListaEnlazada.ListaIterador;

public class ListaEnlazada<T>{
    private int longitud;
    private Nodo primero;
    private Nodo ultimo;

    private class Nodo {
        T valor;
        Nodo sig;
        Nodo ant;

        Nodo(T v) {valor = v;}
    }

    public ListaEnlazada() {
        this.primero = new Nodo(null);
        this.ultimo = new Nodo(null);
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevoNodo = new Nodo(elem);
        if (this.longitud == 0){
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;
        } else {
            this.primero.ant = nuevoNodo;
            nuevoNodo.sig = this.primero;
            this.primero = nuevoNodo;
        }
        this.longitud = this.longitud + 1;
    }

    public void agregarAtras(T elem) {
        Nodo nuevoNodo = new Nodo(elem);
        if (this.longitud == 0){
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;}
        else {
            this.ultimo.sig = nuevoNodo;
            nuevoNodo.ant = this.ultimo;
            this.ultimo = nuevoNodo;
        }
        this.longitud = this.longitud + 1;
    }

    public T obtener(int i) {
        Nodo actual = primero;
        for (int j = 0; j < i; j += 1){
            actual = actual.sig; 
            }
        return actual.valor;
        }


    public void eliminar(int i) {
        Nodo actual = this.primero; 
        Nodo sig = actual.sig;
        Nodo prev = actual.ant;
        if(i == 0 && this.longitud==1){
            this.primero = null; 
        }
        else if(i == 0 && this.longitud>1){
            sig.ant = null; 
            this.primero = sig;
        }else if(i == this.longitud-1){
            for(int j = 0; j<this.longitud; j+= 1){
                prev = actual.ant;
                actual = actual.sig;
            }
        }else{
            for(int j = 0; j<i; j+=1){
                actual = actual.sig;
            }
            prev = actual.ant;
            sig = actual.sig;
            prev.sig = sig; 
            sig.ant = prev; 
              
        }
        this.longitud -= 1;
        
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo actual = this.primero;
        for (int j = 0; j < longitud(); j += 1){
            if (j == indice){
                actual.valor = elem;}
            actual = actual.sig;
        }
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> nuevo = new ListaEnlazada<T>();
        if (this.longitud != 0){
        for (int i = 0; i < this.longitud;i += 1){
                this.agregarAtras(this.obtener(i));
            }
        }
        return nuevo;
    }

    public ListaEnlazada(ListaEnlazada<T> lista){
        for (int i = 0; i < lista.longitud;i += 1){
                this.agregarAtras(lista.obtener(i));
            }
        }
    
    
    @Override
    public String toString() {
        String texto = "";
        Nodo actual = this.primero;
        for (int i = 0; i < this.longitud; i += 1){
            if (i == 0){
                    texto = texto +"[" + actual.valor + ",";
                    actual = actual.sig;
                }
            else if (i < this.longitud - 1){
                texto = texto + " " + actual.valor + ",";
                actual = actual.sig;
            }
            else{
                texto = texto + " " + actual.valor + "]";       
                actual = actual.sig;
            }
    }
    return texto;
}   

    public class ListaIterador implements Iterador<T> {
        int dedito;
        ListaEnlazada<T> nuevo;

        public ListaIterador(ListaEnlazada<T> lista){
            dedito = 0;
            nuevo = lista;
        }

        public boolean haySiguiente() {
            return (dedito != nuevo.longitud);
        }
        
        public boolean hayAnterior() {
            return (dedito != 0);
        }

        public T siguiente() {
            dedito = dedito + 1;
            return nuevo.obtener(dedito - 1);
        }
        

        public T anterior() {
	        dedito = dedito - 1;
            return nuevo.obtener(dedito);
        }
    }

    public ListaIterador iterador() {
	    return new ListaIterador(this);
    }

}
