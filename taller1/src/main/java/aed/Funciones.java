package aed;
import java.util.ArrayList;
import java.util.List;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt((x*x) + (y*y));
        return res;
    }

    boolean esPar(int n) {
        boolean res;
        if ((n % 2) == 0){
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res;
        if ((n % 4 == 0) && ((n % 100 != 0) || (n % 400 == 0))){
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    int factorialIterativo(int n) {
        int res = n;
        int valor = n;
        if ((n == 0) || (n == 1)){
            res = 1;
        }
        else{
            while (valor > 1){
                res = res * (valor - 1);
                valor = (valor -1);
            }
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res;
        if ((n == 1) || (n == 0)){
            res = 1;
        }
        else{
            res = n * factorialIterativo(n - 1);
        }
        return res;
    }

    boolean esPrimo(int n) {
        boolean res = true;
        if ((n == 0) || (n == 1)){
            res = false;
        }
        else{
            for (int i = 2; i < n; i += 1){
                if (n % i == 0){
                    res = false;
                }
            }
        }

        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int n : numeros){
            res = res + n;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        for (int i = 0;i<numeros.length; i+= 1){
            if (buscado == numeros[i]){
                return i;
            }
        }
        return -1;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;
        for (int i = 0;i<numeros.length; i+= 1){
            if (esPrimo(numeros[i]) == true){
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;
        for (int i = 0;i<numeros.length; i+= 1){
            if (numeros[i] % 2 != 0){
                res = false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        if (s1.length() > s2.length()){
            res = false;
        }
        else if (s1.length() == s2.length()){
            if (s1 == s2){
                res = true;
            }
            else{
                res = false;
            }
        }  
        else{
            for (int i = 0;i<s1.length();i+=1){
                if (s1.charAt(i) != s2.charAt(i)){
                    res = false;
                }
            }
        }
        
        return res;
    }

    String reverso (String s) {
        String res = ""; 
        for (int i = s.length() - 1 ; i >= 0;  i--) {
            res += s.charAt(i); 
        }
        return res;

    }

    boolean esSufijo(String s1, String s2) {
        boolean res = true;
        if (s1.length() > s2.length()){
            res = false;
        }
        else if (s1.length() == s2.length()){
            if (s1 == s2){
                res = true;
            }
            else{
                res = false;
            }
        }  
        else{
            for (int i = 0;i<s1.length();i+=1){
                if ((reverso(s1)).charAt(i) != (reverso(s2)).charAt(i)){
                    res = false;
                }
            }
        }
        return res;
        }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        boolean res;
        if (a==b){
            res = false;
        }
        else{
            res = true;
        }
        return res;
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        if (xs.length != ys.length)
            res = false;
        else{ 
            for (int i = 0; i < xs.length; i++) {
                if (xs[i] != ys[i]){
                    res = false;
                }
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
            if (xs.length < 2){
                res = true;
            }
            else{
            for (int i = 0; i < (xs.length-1); i++) {
                if (xs[i] > xs [i+1]) {
                    res = false;
            }
        }
        }
        return res;
        }

    int maximo(int[] xs) {
        int res = 0;
        if (xs.length == 0){
            res = 0; 
        }
        if (xs.length == 1){
            res = xs[0];
        }
        else{
            res = xs[0];
            for (int i = 0; i < xs.length; i++) {
                if (xs[i] > res) res = xs[i];
        }
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x = 0; x < xs.length; x += 1) {
            if (xs[x] <= 0){
                res = false;
            }
        }
        return res;
    }

}
