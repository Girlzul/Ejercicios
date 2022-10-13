package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        //Escribe un programa que lea por teclado un valor
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        //y verifique
        boolean menorQue10 = valor < 10;

        System.out.println(menorQue10);

    }
}
