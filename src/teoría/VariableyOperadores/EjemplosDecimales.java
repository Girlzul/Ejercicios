package teoría.VariableyOperadores;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {
        //float = 16 bits o 6-7 decimales y double = 64 bits
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNeg = -1.659;

        //tipo float
        float decimalFloat = 1.3f;
        float decimalLargo = 4.6161451455f;
        System.out.println(decimalLargo);//perdemos precision

        //notación científica
        double eps = 5e-3; // es lo mismo que 5 * 10^ (-3) = 0.005
        System.out.println(eps);
        double n = 0.01e2;

        //OPERACIONES ARITMÉTICAS
        System.out.println( "suma: " + (eps + n));
        System.out.println(" resta: " + (eps - n));
        System.out.println(" ptoducto: " + (eps * n));
        System.out.println(" división: " + (eps / n));

        //¿Qué pasa si divido numeros enteros y los guardo como decimales?
        double d1 = 5 / 4;//divide dos números enteros(división entera) y lo asigna a la variante decimal
        System.out.println("División 1: " + d1);
        double d2 = 5.0 / 4.0;// divide dos n´´umeros decimales (división decimal)
        System.out.println("División 2: " + d2);

        //falta de precision

        //leer desde teclado
        Scanner scanner = new Scanner(System.in);
        float decimal = scanner.nextInt();
        System.out.println(decimal);
        double doubleT = scanner.nextDouble();
        System.out.println(doubleT);
;


    }
}
