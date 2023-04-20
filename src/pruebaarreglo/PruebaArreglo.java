/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarreglo;

/**
 *
 * @author Facundo
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int[] arregloAsumar = {1, 2, 3, 4, 5};
        Arreglo.sumarLista(arregloAsumar);
        String hola = "hola";
        Arreglo.cuentaVocales(hola);
        String Test2 = "argentina";
        System.out.println("Contador de caracteres: " + Arreglo.cuentaCaracter(Test2, 'a'));
        int numeros[][];
        numeros = new int[2][];

        numeros[0] = new int[2];
        numeros[1] = new int[1];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        
        numeros[1][0] = 3;
        */
        
        int[][] m={{12,15,39}, {10,0}, {59,1,13,14,17}};
      
        
    
        System.out.println("El numero mayor ingresado es: "+Arreglo.buscarMayor(m));
        

    }

}
