package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        * Escribe un programa que, dado un importe en euros, indique el número mínimo de
    billetes y la cantidad sobrente que se pueden utilizar para obtener dicha cantidad.
    Por ejemplo:232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros. */

        Scanner scanner = new Scanner(System.in);
        int euros = scanner.nextInt();
        int billete500 = euros / 500; //el resto queda lo demás
        int auxiliar = euros % 500 ; // el resto queda lo demás: 200, 100...
        int billete200 = auxiliar / 200;
        auxiliar = auxiliar % 200;// aqui el resto está lo que queda
        int billete100 = auxiliar /100;
        auxiliar = auxiliar % 100;
        int billete50 = auxiliar / 50;
        auxiliar = auxiliar % 50;
        int billete20 = auxiliar / 20;
        auxiliar = auxiliar % 20;
        int billete10 = auxiliar / 10;
        auxiliar = auxiliar % 10;
        int billete5 = auxiliar / 5;
        auxiliar = auxiliar % 5;
        int moneda2 = auxiliar / 2;
        int moneda1 = auxiliar % 2;
        System.out.println(euros + " euros:" + billete500 + " billetes de 500, " + billete200 + " billetes de 200, " + billete100 + " billetes de 100, " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + billete5 + " billetes de 5, " + moneda2 + " monedas de 2 euros, " + moneda1 + " monedas de un euro" );



    }
}
