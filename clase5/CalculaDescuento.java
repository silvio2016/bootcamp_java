import java.util.Scanner;

/*3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando
la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.*/
public class CalculaDescuento {
    public static void main(String[] args){
        Scanner CalculaDescuento = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: $");

        Double PrecioProducto = CalculaDescuento.nextDouble();

        System.out.print("Ingresa el porcentaje del descuento: ");

        Double PorcentajeDescuento = CalculaDescuento.nextDouble();

        Double PreciFinal = PrecioProducto - (PrecioProducto*PorcentajeDescuento/100);

        System.out.print("Tu descuento en este producto es de: " + "$" + PreciFinal);

    }
}
