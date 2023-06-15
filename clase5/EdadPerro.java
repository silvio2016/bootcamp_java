import java.util.Scanner;

public class EdadPerro {
    public static void main(String[] args) {
        Scanner ingresaEdad = new Scanner(System.in);

        /*1) Calculadora de edad de perros:
        Pídele al usuario que ingrese la edad de su perro.
        Convierte esa edad a años de perro (se dice que 1 año
        humano equivale a 7 años de perro).
         */
        System.out.println("Ingresa la edad en años humanos de tu perro:");

        Integer edad = ingresaEdad.nextInt();

        Integer edadPerro = edad * 7;

        System.out.println("La edad real de tu perro es de: " + edadPerro + " Años");

    }
}
