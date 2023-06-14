package clase6;

import java.util.Scanner;

public class ParImpar {
    public static void main (String arg[]){
        Scanner tecleado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");

        int numero = tecleado.nextInt();

        if (numero % 2 == 0) {
            System.out.print( "El número " + numero +  " que ingresate es PAR");

        }
        else {
            System.out.print( "El número " + numero +  " que ingresate es IMPAR");
        }

    }
}