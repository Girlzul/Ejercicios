import java.util.Scanner;

public class EjemploLeerPorTeclado {
    public static void main(String[] args) {
        //entrada estándar= teclado
        Scanner scanner = new Scanner(System.in);
        //Ahora podemos meter datos por teclado
        //pero para poder utilizarlos necesitamos guardarlos en variables.
        //Las variables se guardan en palabras o cadenas de texto wue se llaman String
        System.out.println("introduce tu nombre: ");
        String nombre = scanner.nextLine();//escribe mi nombre en el
        System.out.println("Hola, "+ nombre);
        System.out.println("introduce tu apellido");
        //crear otra variable para guardar el apellido
        String apellido = scanner.nextLine();
        System.out.println("Hola, "+ nombre + " " + apellido);
        System.out.println("¿Cuantos años tienes?");
        int edad = scanner.nextInt();// automaticamente mete salto de linea a lo que venga después que no sea número.
        //La manera de evitar esto, es: cada vez que escribas nextInt(), si sé que desp voy a poner un NextLine(), escribo un nextLine() Adicional, así limpiamos en scanner
        scanner.nextLine();
        System.out.println("Vaya, pareces joven a pesar de tener esa edad");
        System.out.println("¿Tienes mascotas?");
        String mascota = scanner.nextLine();
        System.out.println("Perfecto.");

        //VAMOS CON DATOS DECIMALES
        System.out.println("¿Y cual es tu patrimonio?");
        double patrimonio = scanner.nextDouble();
        System.out.println("¡" + patrimonio + "!");

        //CON LOS DECIMALES HAY QUE METERLOS CON COMAS ,

        //



    }
}
