package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /* Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
    de ellos.*/

        //Vamos a utilizar dos variables auxiliares.
        //En kax vamos a guardar temporalmente el numero mayor que tengamos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int n1 = scanner.nextInt();
        //al pedir el primer numero ese es el mayor y el menor que tenemos de momento, así que lo asignamos a a estas variables.
        int max = n1;
        int min = n1;
        System.out.print("Número: ");
        int n2 = scanner.nextInt();
        if (n2 > max) {
            max = n2;
        }
        if (n2 < min) {
            min = n2;
        }
        System.out.print("Número: ");
        int n3 = scanner.nextInt();
        if (n3 > max) {
            max = n3;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.print("Número: ");
        int n4 = scanner.nextInt();
        if (n4 > max) {
            max = n4;
        }
        if (n4 < min) {
            min = n4;
        }
        System.out.print("Número: ");
        int n5 = scanner.nextInt();
        if (n5 > max) {
            max = n5;
        }
        if (n5 < min) {
            min = n5;
        }
        System.out.print("Número: ");
        int n6 = scanner.nextInt();
        if (n6 > max) {
            max = n6;
        }
        if (n6 < min) {
            min = n6;
        }
        System.out.print("Número: ");
        int n7 = scanner.nextInt();
        if (n7 > max) {
            max = n7;
        }
        if (n7 < min) {
            min = n7;
        }
        System.out.print("Número: ");
        int n8 = scanner.nextInt();
        if (n8 > max) {
            max = n8;
        }
        if (n8 < min) {
            min = n8;

            System.out.print("Número: ");
            int n9 = scanner.nextInt();
            if (n9 > max) {
                max = n9;
            }
            if (n9 < min) {
                min = n9;
                System.out.print("Número: ");
                int n10 = scanner.nextInt();
                if (n10 > max) {
                    max = n10;
                }
                if (n10 < min) {
                    min = n10;
                }

            }
        }
    }
}