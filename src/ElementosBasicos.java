public class ElementosBasicos {
    public static void main(String[] args) {
        //variable
        int a = 5; // Declaro la variable a y a continuación guardo en ella el valor 54
        //las variables van en MINISCULAS
        System.out.println("la variable a vale " + a);
        //su valor puede ser modificador en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);

        // Reglas para nombrar variables
        //No se puede comenzar por ningun digito
        //int 5c = 4; --> no copila

        //Puede contener cualquir letra o digito
        int c57 = 2;
        //No puede contener ningun caracter especial(signos, . :) a excepcion de _ y $
        int _variable = 3;
        int $otraVariable = 4;
        //No puede contener espacios
        //int otra variable; --> no copila

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("==========");
        System.out.println("las variables se declara poniendo 1º el tipo de variable que es y 2º el nombre que le vamos a dar");
        System.out.println("Variables para numeros enternos: byte, short,");

        System.out.println("BYTE");
        byte variablePequenita = 64; //tope el 127 para guardar con la variable tipo byte
        byte variableByteNegativo = -128; //Es el tope mas pequeño para guardar en byte
        System.out.println("variablePequeñita = " + variablePequenita);
        System.out.println("variableByteNegativo = " + variableByteNegativo);

        //int=32 bits
        //byte= 8 bits
        //long=64 bits
        //short= 16 bits

        System.out.println("NUMEROS DECIMALES: float o double");
        double decimal = 3.14;
        System.out.println(decimal);
        double numero = 8;
        System.out.println(numero);
        float otroDecimal = 8.45f;//cuando utilizas float tienes uqe poner al final una f.
        System.out.println(otroDecimal);
        //Formas alternativas de declarar una variable(pag 11)

        String lenguaje = "java";
        String version = "8 o superior";
        //tambien se puede hacer asi
        String lenguaje1 = "java" , version1 = "10 o superior";
        int num1 = 5, num2 = 10; // dos variables de tipo int en la misma linea
        //tambien puedes hacer
        int num3; //aqui declaro sin asignar nada,coge el valor por defecto
        num3 = 6;
        num3 = num1;// puedo cambiar el valor
        System.out.println(num3);

        //Inferencia de tipos
        var variable = "Hola";
        var otraVariable = 10;











    }
}
