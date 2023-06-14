/* 6) Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor”.
*
* USANDO IF y ELSE
*
* Este código utiliza la clase Scanner para leer los números ingresados por el usuario. Luego, se compara cada número
* con los otros dos para encontrar el mayor y el menor. Finalmente, se muestra el resultado en la consola.
*
* */



import java.util.Scanner;
public class MayorMenor {
    public static void main(String arg[]) {
        Scanner NumeroIngrsado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int PrimerNumero = NumeroIngrsado.nextInt();

        System.out.print("Ingresa un otro numero: ");
        int SegundoNumero = NumeroIngrsado.nextInt();

        System.out.print("Ingressa otro numero: ");
        int TercerNumero = NumeroIngrsado.nextInt();


        int Mayor = PrimerNumero;
        int Menor= PrimerNumero;

        if (SegundoNumero > PrimerNumero) {
            Mayor = SegundoNumero;

        }
        else {
            Menor = PrimerNumero;
        }

        if ( TercerNumero > Mayor){
            Mayor = TercerNumero;
        }

        else {
            Menor = TercerNumero;
        }

        System.out.println("El mayor número es: " + Mayor);
        System.out.println("El menor número es: " + Menor);

    }
}