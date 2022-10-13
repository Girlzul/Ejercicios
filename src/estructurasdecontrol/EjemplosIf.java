package estructurasdecontrol;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {

        //VAMOS A VER TRES FORMAS: IF(CONDICION)---si no(otra opcion), IF (CONDICION)---else(o hace una cosa, o hace otra), IF(CONDICION)--si no, le pones otro if.

        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Dime tu edad: ");
        int edad = scanner.nextInt();

        //si la edad es mayor que 100, es una persona con mucha experiencia
        //si no, pues nada
        if (edad > 100){
            System.out.println("Eres una persona con mucha experiencia");*/
        // }
        //La variable es boolean; podemos simplificar
        /*boolean semaforoA = true;

        if (semaforoA == true) {
            System.out.println("Adelante, puede pasar. ");
        } else {
            System.out.println("Detente, pecador.");
        }*/

        //Vamos a ver si es par o impar
        /*System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        if  (numero % 2 == 0 ){
            System.out.println("Es numero es par");
        } else {
                System.out.println("El numero es impar");
            }*/

        //TERCER CASO
        int presupuesto = scanner.nextInt();
        if (presupuesto < 100){
            System.out.println("Esto no es para mi");
        }
        else if (presupuesto <= 100) {
            System.out.println("Puedes obtar por el básico");
        }
        else if (presupuesto > 100 && presupuesto<200){
            System.out.println("puedes obtar por el estandar");
        }
        else if (presupuesto > 300){
            System.out.println("Puedes obtar con el premium");
        }
        else {
            System.out.println("Me compro lo que quiera");
        }
    }
}
