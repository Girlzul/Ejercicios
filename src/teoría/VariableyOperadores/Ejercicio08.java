package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int min = segundos / 60;
        int segundosRes = segundos % 60;
        int horas = min % 60;
        int minRes = min % 60;
        System.out.println( segundos + " contienen " + horas + " horas " + minRes + " minutos " + segundosRes + " segundos");



    }
}
