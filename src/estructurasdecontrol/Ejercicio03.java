package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = scanner.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = scanner.nextInt();

        if (num > num2){
            System.out.println("El primer número es mayor que el segundo");
        }
        else {
            System.out.println("El segundo numero es mayor que el primero");
        }
    }
}
