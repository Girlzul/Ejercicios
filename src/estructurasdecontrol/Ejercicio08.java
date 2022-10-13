package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
        //“no” (en vez de true/false).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eres culpable? (S/N): ");
        String culpable =scanner.nextLine();
        if (culpable.equals("S")){ //la comparación entre string se hace con el método equal
            System.out.println("¡A  la carcel!");
        }else if (culpable.equals("N")){
            System.out.println("¡A casa!");
        }else{
            System.out.println("no me valices");
        }

    }
}
