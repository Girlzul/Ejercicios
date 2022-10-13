package teoría.BOOLEAN;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; //int ocupa 32 bits
        long numGrande = num; //puedo asignair un int a long (casting implícito)

        // y al reves?
        long numGrande2 = 101; //long = 64 bits
        int entero = (int) numGrande2; //casting explicito

        // de int a short
        short numeroCorto = (short) num; //no puedo hacerloo directamente porque int son 32 y short son 16,pero al poner// (short) num, si//

        //de char a int
        char letra = 'a';
        int letraA = letra;
        System.out.println(letraA);

        char inte = '?';
        int interr = inte;
        System.out.println(interr);

        //float a double
        float decimal = 3.1416f;
        double decimalDoble = decimal;

        //de double a float
        double decimalDoble2 =3000000000000000.1416;
        float decimalF = (float) decimalDoble2;

        //de double a int
        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits);

        //double a short

        short entero16 = (short) decimalDoble2;
        System.out.println(entero16);


    }
}
