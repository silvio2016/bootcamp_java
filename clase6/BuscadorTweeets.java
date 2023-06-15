
/* 2) Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo:
“Messi”.
Después muestra en consola la concatenación de : https://twitter.com/search?q=” + palabra */

package clase6;

import java.util.Scanner;

public class BuscadorTweeets {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una palabra por teclado: ");

        String palabra = teclado.next();
        System.out.print("https://twitter.com/search?q=" + palabra);
    }
}
