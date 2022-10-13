package teoría.VariableyOperadores;

import java.util.Scanner;

public class EjemplosOperadoresRelacionales {
    public static void main(String[] args) {
        //Sirven para comparar dos números( normalmente) y dan como resultado boolean.

        int num1 = 35;
        int num2 = 23;

        num2 = num1;//estoy asignando a num2 el valor de num1
        boolean comparacion = num2 == num1;// estoy comparando las variables num1 y num2 y el resultado (true) lo asigno a comparacion.
        boolean otraComparacion = num2 != num1;

        int nueve = 9;
        int otroNueve = 9;
        int diez = 10;
        System.out.println(nueve > otroNueve);
        System.out.println(nueve >= otroNueve);

        int edad = 18;
        System.out.println("¿Mayor de edad?" + (edad >= 18));
        System.out.println("¿Mayor de edad?" + (edad > 17));

        //Cuando aparecen operadores mezclados de distinto tipo
        /*
        El orden de prioridad de los elementos en la simtaxis de Java de este:
        1) Parantesis
        2) Incrementos y decremos ( ++ y --)
        3) Operados aritméticas (en el orden habitual : primero * y/, después + y -)
        4)Operadores relacionales (>, >=, ==,ect).
        5)Operador lógicos (en el orden indicado :!, ^, &&, ||)
         */

        int num = 1000;
        boolean resultado = num + 10 > num + 9 ; //1010 > 1009

        //UNIR OPERACIONES RELACIONALES USANDO OPERADORES LÓGICAS
        int a = 5;
        int b = 6;
        int c = 7;
        //quiero saber si a<= b <= c

        System.out.println(a <= b && b <= c);

        //ejemplo: pedimos tres estaturas por teclado y queremos ver si están en el orden ascendente.
        Scanner scanner = new Scanner(System.in);
        int estatura1 = scanner.nextInt();
        int estatura2 = scanner.nextInt();
        int estatura3 = scanner.nextInt();

       boolean ordenascendente = estatura1<=estatura2&&estatura2<=estatura3;
        System.out.println("Orden ascendente: " + ordenascendente);
       boolean ordendescendente = estatura1 >=estatura2&&estatura2>=estatura3;
        System.out.println("Orden descendente: " + ordendescendente);


    }
}
