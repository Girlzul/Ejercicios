package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /* Realiza un programa que pida el precio de venta de un producto, la cantidad de
productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
importe a abonar.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Cantidad de productos a comprar: ");
        double cantidad = scanner.nextDouble();
        System.out.println("Porcentaje de IVA a aplicar: ");
        double porcentajeIVA = scanner.nextDouble();

        double resultado = (precio * cantidad) * (porcentajeIVA / 100);
        System.out.println("El resultado a pagar es: " + ((precio * cantidad) + resultado ) );

    }
}
