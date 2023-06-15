
/*4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).*/

import java.util.Scanner;

public class CalculaPropinas {
    public static void main (String[] args){
        Scanner CalculaGanancias = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta del restaurante: $");
        Double TotalRestaurante = CalculaGanancias.nextDouble();

        System.out.print("Ingresa el porcentaje de propina que deseas dejar: $");
        Double PorcentajePopina = CalculaGanancias.nextDouble();

        Double MontoPropina = TotalRestaurante*(PorcentajePopina/100);
        System.out.print("El monto de la propina es: " + "$" + MontoPropina);
    }

}
