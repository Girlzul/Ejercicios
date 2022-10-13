package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03bis {
    public static void main(String[] args) {
        //Este es inventado para ver la diferencia entre que me pregunten una cosa u otra habiendo if por medio.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = scanner.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = scanner.nextInt();

        //indica si el 1 es mayot, igual o menor que el segundo.
        if (num > num2){
            System.out.println("El primero es mayor que el segundo");
        } else if (num == num2){
            System.out.println("Los dos números son iguales");
        }else {
            System.out.println("El segundo número es mayor");
        }
    }
}
