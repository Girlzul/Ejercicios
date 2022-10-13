package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
            /* una conocida marca de comida rápida cuanto le costará en función del topping que
elija.
• El helado sin topping cuesta 1.90€.
• El topping de oreo cuesta 1€.
• El topping de KitKat cuesta 1.50€.
• El topping de brownie cuesta 0.75€.
• El topping de lacasitos cuesta 0.95€.
• En caso de no disponer del topping solicitado por el usuario el programa escribirá
por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará
del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado con el topping
seleccionado (o ninguno).*/
        Scanner scanner = new Scanner(System.in);
        System.out.printf("¿Cómo quiere el helado?: ");
        String helado = scanner.nextLine();
        double SinTopping = 1.9;
        double oreo = 1;
        double KitKat = 1.5;
        double brownie = 0.75;
        double lacasitos = 0.95;

        switch (helado){
            case "Sin topping":

        }
    }
}
