package pruebaarreglo;

import java.util.ArrayList;

public class Arreglo {

    public static void sumarLista(int vec[]) {
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Vector numeros a sumar: " + vec[i]);
            suma = suma + vec[i];
        }
        System.out.println("Suma completa del vector: " + suma);
        promedio = suma / vec.length;
        System.out.println("Promedio: " + promedio);
    }

    public static int buscarMayor(int[][] m) {
       int mayor=m[0][0];
       
        for (int f = 0; f < m.length; f++) {
            for (int c=0; c < m[f].length; c++) {
                if (m[f][c] > mayor) {
                    mayor = m[f][c];
                }
            }
        }
        return mayor;
    }

    public static void cuentaVocales(String x) {
        int contador = 0;
        for (int i = 0; i < x.length(); i++) {
            char busqueda = x.toLowerCase().charAt(i);
            if (busqueda == 'a' || busqueda == 'e' || busqueda == 'i' || busqueda == 'o' || busqueda == 'u') {
                contador++;
            }
        }
        System.out.println("La cadena tiene un total de : " + contador + " Vocales");
    }

    public static int cuentaCaracter(String x, char y) {
        int cont = 0;
        for (int i = 0; i < x.length(); i++) {
            char busqueda = x.toLowerCase().charAt(i);
            if (busqueda == y) {
                cont++;
            }
        }
        return cont;
    }

}
