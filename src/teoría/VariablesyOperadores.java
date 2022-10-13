package teoría;

import java.util.Scanner;

public class VariablesyOperadores {
    public static void main(String[] args) {
        //PEDIR POT TECLADO DOS NUMEROS Y GUARDARLOS EN DOS VARIABLES DE TIPO ENTERO
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número");
        int num1 = scanner.nextInt();
        System.out.print("Segundo número");
        int num2 = scanner.nextInt();

        //CREAR VARIABLES QUE GUARDEN EL RESULTADO DE LAS CINCO OPERACIONES POSIBLES
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;

        //MOSTRAR EL RESULTADO DE CADA OPERACIÓN
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println( num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es igual a " + resto);

    }
}
