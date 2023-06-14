/* 1) Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación. */

package clase6;
import java.util.Scanner;

public class Paises {
    public static void main (String arg []){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el nombre de un país: ");
        String pais = teclado.next();

        System.out.print( "https://www.google.com/maps/search/" + pais);
    }
}
