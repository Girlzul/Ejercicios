package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //imprime solo las decenas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de dos dígitos");
        int numero = scanner.nextInt();

        //las decenas son el cociente
        System.out.println("Las decenas son : " + (numero/10));
        System.out.println("... y las unidades: " + (numero % 10));
    }
}
