package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número de dos cifras");
        int numero = scanner.nextInt();
        //escribe un programa que permira obtener el número invertido. Por ejmeplo, si pones 23 que salga 32

        int decenas = numero / 10;
        int unidades = numero % 10;
    //lo mostramos al reves
        System.out.println(unidades + "" + decenas);

    }
}
