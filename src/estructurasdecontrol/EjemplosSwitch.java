package estructurasdecontrol;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una acción (1-4) ");
        int accion = scanner.nextInt();
        scanner.nextLine();

       /* if (accion == 1){
            System.out.println("Comenzando partida");
        } else if (accion == 2) {
            System.out.println("Cargando partida guardada");
        } else if (accion == 3) {
            System.out.println("Mostrar ayuda");
        } else if (accion == 4) {
            System.out.println("salir");
        }else {
            System.out.println("Acción incorrecta");
        }
        */
        //SE PUEDE UTILIZAR DE OTRA FORMA
        //Cuando en el if tienes == o equals ->evalúas en valor de una variable y según sea, haces una acción u otra.

       /* switch (accion) { //en ese () puede ir el nombre de la variable
            case 1 :
                System.out.println("Comenzamos la partida");
                break;
            case 2:
                System.out.println("Cargando partida guardada");
                break;
            case 3:
                System.out.println("Mostrar ayuda");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default: //aqui entra si no se cumple ninguno de los casos anteriores.
                System.out.println("Acción incorrecta");*/

        //OTRO EJEMPLO CON EL SWITCH

        System.out.println("Dia de la semama");
        String dia = scanner.nextLine();
        //según el día que sea quiero que me ponga un número
        int numero = 0;
        switch (dia){
            case "Lunes":
                numero = 1;
                break;
            case "Martes":
                numero = 2;
            case "Miércoles":
                numero = 3;
                break;
            case "Jueves":
                numero = 4;
                break;
            case "Viernes":
                numero = 5;
                break;
            default:
                System.out.println("Lo que has intruducido no es un día de la semana");
        }
        System.out.println(numero);
    }
}
