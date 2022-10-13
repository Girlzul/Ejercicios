package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Operación a realizar: ");
        char operacion = scanner.next().charAt(0);//para guardar una variable por teclado de tipo char
        int resultado = 0;
        //miro el valor de la variable operación y en función de eso hago una operacioón u otra
        switch (operacion) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
            default:
                System.out.println("Operación incorrecta");
                System.out.println("Resultado: " + resultado);

        }
    }
}
