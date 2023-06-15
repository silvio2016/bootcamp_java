/*5) Juego de adivinar el número:
        Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.*/

import java.util.Scanner;

public class AdivinaNumero {
    public static void main (String[] args){

        Scanner IngresaNumero = new Scanner(System.in);

        System.out.print("Adivina el númedo.... " + "Ingresa un numero que va desde 1 al 100 : ");
        Integer NumeroUsuario = IngresaNumero.nextInt();
        int numero = (int)(Math.random()*100+1);

        if (NumeroUsuario == numero) {
            System.out.print(numero + "!Genial adivinaste el numero!");

        } else {
            System.out.print(numero + " No adivinaste :(");
        }

    }
}
