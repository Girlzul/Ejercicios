package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /* 27. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
    calificación se compone de los siguientes porcentajes:
       a. 55% del promedio de sus tres calificaciones parciales.
    b. 30% de la calificación del examen final.
    c. 15% de la calificación de un trabajo final.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Parcial 1: ");
        double parcial1 = scanner.nextDouble();
        System.out.println("Parcial 2: ");
        double parcial2 = scanner.nextDouble();
        System.out.println("Parcial 3: ");
        double parcial3 = scanner.nextDouble();

        System.out.println("Examen final: ");
        double examenFinal = scanner.nextDouble();

        System.out.println("Trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        double promedio = ((parcial1 + parcial2 + parcial3) / 3);

        double porcentaje = (promedio * 0.55);
        System.out.println(porcentaje);

        double porcentajeEFinal = examenFinal * 0.3;
        System.out.println(porcentajeEFinal);
        double porcentajePFinal = trabajoFinal * 0.15;

        double calificacion = porcentaje + porcentajePFinal + porcentajeEFinal;
        System.out.printf("La calificación final es: %.2f" , calificacion);

    }
}
