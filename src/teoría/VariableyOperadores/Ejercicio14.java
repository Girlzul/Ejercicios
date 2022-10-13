package teoría.VariableyOperadores;

public class Ejercicio14 {
    public static void main(String[] args) {
        //calcule la L de una circunferencia .
        // formula : 2*pi *r
        double radio = 3;
        //NEW : el numero pi lo podemos poder como Math.PI
        double circunferencia = 2 * Math .PI * radio;
        System.out.println(circunferencia);

        //NEW: para mostrar un número de muchos decimales o cifras, con solo dos:
        System.out.printf("La circunferencia es %.4f",circunferencia);



    }
}
