package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto ganas?: ");
        double salario = scanner.nextDouble();
        if (salario <= 9000){
            System.out.println("No deberá abonar nada");
        } else {
            System.out.println("Deberá abonar impuestos");
        }
    }
}
