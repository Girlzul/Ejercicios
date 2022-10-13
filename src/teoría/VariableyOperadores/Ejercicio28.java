package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
   //   Escribe un programa que
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
   //y decremente cada uno de ellos.
   //El programa debe mostrar los resultados en la misma linea, en el mismo orden que entraron, separados por espacios.
   //vamos a practicar con las distintas formas de decrementar.
        n3 -= 1; //porque esto esa asi, no lo puedo poner dentro del sout
        n4--; //no lo pongo dentro del sout porque me imprimiría antes de incrementarse
        System.out.printf(((n1 - 1) + " " + --n2 + " " + n3 + " " + n4));
    }
}
