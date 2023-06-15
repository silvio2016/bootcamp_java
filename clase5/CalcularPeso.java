import java.util.Scanner;

public class CalcularPeso {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        //Peso en KG / altura en metros al cuadrado

        System.out.println("ingresa tu peso en kilogramos");
        double peso = cargarDatos.nextDouble();
        System.out.println("ingresa tu altura metros");
        double altura = cargarDatos.nextDouble();
        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es " + indiceMasaCorporal);



        if (indiceMasaCorporal >=30) {
            System.out.println("Estas en estado de obesidad");
        }

        // Entre 25 y 30 Sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal <29.9 ) {
            System.out.println("tienes sobrepeso");
        }
        // Pesao Normal 18.5 a 24.9
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal <24.9) {
            System.out.println("Tu peso es normal");
        }

        //Menor a 18.6 debajo del normal
        if (indiceMasaCorporal < 18.6) {
            System.out.println("Estas por debajo del peso normal");

        }
    }
}
