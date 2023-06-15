package clase7;

import java.util.Scanner;

/*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/
public class ArregloCincoNumeros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(int);
        // crear un arreglo de numero enteros
        int[] numeros= new int [5];

        System.out.println("Ingrese un numero");
        numeros[0]= teclado.nextInt();

        System.out.println(numeros[0]);



    }


}
