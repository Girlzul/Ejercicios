package EjerciciosBasicos;

import java.util.Scanner;

public class EjercicioTrece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenida/o, " + nombre);
        System.out.println("¿Cuántos años tienes?");
        String edad = scanner.nextLine();
        System.out.println("¿Cuantos años de experiencia tienes?");
        int años = scanner.nextInt();
        System.out.println("¿Preferencia de cocina?");
        scanner.nextLine();
        String cocina = scanner.nextLine();
        System.out.println("El formulario de " + nombre + ",de " + edad + " años y " + años + " años de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida " + cocina);



    }
}
