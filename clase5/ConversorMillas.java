

import java.util.Scanner;

public class ConversorMillas {

    public static void main(String[] args) {
        /*2) Conversor de millas a kilómetros:
        Pídele al usuario que ingrese una distancia en millas.
        Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        Muestra la distancia en kilómetros al usuario.*/

        Scanner CragaMillas = new Scanner(System.in);

        System.out.print("Ingresa una distancia en millas: ");

        Double Millas = CragaMillas.nextDouble();

        Double Resultado = Millas* 1.60934;

        System.out.print(" El resultado convertido a kilometros es de: " + Resultado + " Kilometros");

    }

    }
