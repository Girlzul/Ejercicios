package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /* Realiza un programa que pida un número y un porcentaje, y
a. Calcule y muestre ese número incrementado en ese porcentaje.
b. Calcule y muestre ese número decrementado en ese porcentaje.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número: ");
        double numero = scanner.nextDouble();
        System.out.print("Porcentaje: ");
        double porcentaje = scanner.nextDouble();
        double numpor = (numero * ( porcentaje / 100));
        System.out.print("El porcentaje calculado es: " + numpor);

        System.out.println("Ahora vamos a ver el incremento y decremento: ");
        double incremento = numero + numpor;
        System.out.println(incremento);
        double deceremento = numero - numpor;
        System.out.println(deceremento);

    }
}
