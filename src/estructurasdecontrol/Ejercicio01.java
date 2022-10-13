package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
        }else
            System.out.println("El numero es impar");
    }
}
