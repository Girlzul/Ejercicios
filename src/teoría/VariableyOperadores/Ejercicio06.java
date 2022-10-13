package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cúantas ardillas hay?");
        int ardillas = scanner.nextInt();
        System.out.println("¿Cuantás nueces hay?");
        int nueces = scanner.nextInt();

        int cociente = nueces / ardillas;
        int resto =  nueces % ardillas;

        System.out.println("tocarían a " + cociente + " nueces cada uno");
        System.out.println("sobrarían " + resto + " nueces");

    }
}
