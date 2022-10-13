package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base: ");
        double base = scanner.nextDouble();
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double area = (base * altura/2);
        System.out.println("Área: " + area);

    }
}
