package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
        //comparan con dos valores guardados previamente. Si coinciden, se indica “Has
        //entrado al sistema”, en caso contrario se da un error.

        String user = "Gemma";
        String passwo = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña:" );
        String password = scanner.nextLine();

        if (usuario.equals(user) && password.equals(passwo));

    }
}
