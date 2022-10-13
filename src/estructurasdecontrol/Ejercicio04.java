package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
    ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
    a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
    bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
    b. false, en caso contrario.
    Escribe el código necesario.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Nivel de estudios:\n + sin estudios\n - educacion primaria\n - ESO\n - Grado Medio\n - Estudios Superiores");
        int estudios = scanner.nextInt();
        System.out.println(estudios);
        int ingresos = scanner.nextInt();
        System.out.println(ingresos);

        boolean jasp;
        if (edad <= 28 && estudios > 3 || edad < 30 && ingresos >28000 ){
            jasp = true;
        }else {
            jasp = false;
        }

        if (jasp){
            System.out.println("Eres un joven aunque sobradamente preparado");
        }
    }
}
