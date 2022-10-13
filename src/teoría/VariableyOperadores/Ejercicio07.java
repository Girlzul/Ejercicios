package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        // calculamos cuantas h y min corresponden a los min introducidos
        int horas = minutos / 60;
        int minutosRes = minutos % 60 ;
        System.out.println(minutos + " minutos equivalen a " + horas + " horas y " + minutosRes + " minutos ");
    }
}
