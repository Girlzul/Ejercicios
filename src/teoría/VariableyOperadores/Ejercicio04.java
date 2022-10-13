package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer númeno");
        int num1 = scanner.nextInt();
        System.out.print("Segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Tercer número");
        int num3 = scanner.nextInt();
        System.out.print("Cuarto Número");
        int num4 = scanner.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num3 + " * " + num4 + " = " + producto);





    }
}