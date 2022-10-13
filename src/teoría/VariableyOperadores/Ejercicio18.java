package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

    /*
    Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:

Reamur = Centígrados x 0.8
Fahenheit = (Centígrados * 9/5)+32
Kelvin = Centígrados + 273
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Centigrados: ");
    double centigrados = scanner.nextDouble();
    double reamur = centigrados * 0.8;
    double F = (centigrados * 9/5 + 32);
    double Kelvin = centigrados + 273;
        System.out.println(reamur + " Reamur " + F + " Fahemhei "+ Kelvin + " Kelvin." );
}
}
