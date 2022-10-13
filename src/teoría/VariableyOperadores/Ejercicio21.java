package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /* Realiza un programa que pida las notas de las tres evaluaciones del módulo
Programación y muestre la nota final (la nota final es la media de las tres
evaluaciones).*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1 evaluación: ");
        double eva1 = scanner.nextDouble();
        System.out.print("Nota 2 evaluación: ");
        double eva2 = scanner.nextDouble();
        System.out.print("Nota 3 evaluación: ");
        double eva3 = scanner.nextDouble();

        double suma = eva1 + eva2 + eva3;
        double resto = suma / 3;
        System.out.printf(" La nota final es %.2f " , resto);
    }
}
