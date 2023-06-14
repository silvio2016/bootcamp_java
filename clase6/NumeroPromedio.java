package clase6;
/* 5) Armar un programa que permita cargar 3 números y mostrar cual es el número promedio*/

import java.util.Scanner;

public class NumeroPromedio {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero1 = numeros.nextInt();

        System.out.print("Ingresa otro número: ");
        int numero2 = numeros.nextInt();

        System.out.print("ingre el ultimo número: ");
        int numero3 = numeros.nextInt();

        float promedio = (numero1 + numero2 + numero3) / 3;

        System.out.print("El promedio es: "+ promedio);

    }
}