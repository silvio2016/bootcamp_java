/* 3) Arma un programa que permita llamar a una persona por Whatsapp. Es similar al
anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono */

package clase6;

import java.util.Scanner;

public class LlamadasWhatsapp {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        System.out.print("Ingresa un numero telefonico: ");

       int numero = teclado.nextInt();
        System.out.print( "https://api.whatsapp.com/send?phone=" + numero);
    }
}
