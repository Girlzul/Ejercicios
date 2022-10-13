package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        //Escribe un programa que lea un valor entero y verifique si es menor que 10 o  mayor que 0.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número entero : " );
        int numeroEnt = scanner.nextInt();
        boolean numero = numeroEnt <= 10 || numeroEnt >= 0;
        System.out.println(numero);






    }
}
