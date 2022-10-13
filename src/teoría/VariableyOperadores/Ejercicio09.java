package teoría.VariableyOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MOMENTOS INICIAL");
        System.out.println("=========");
        System.out.println("Introduce la hora: ");
        int hora1 = scanner.nextInt();
        System.out.println("Introduce los minutos: ");
        int min1 = scanner.nextInt();
        System.out.println("Introduce los segundos: ");
        int seg1 = scanner.nextInt();
        // truco: pasar todo a segundos
        System.out.println("MOMENTO FINAL");
        System.out.println("========");
        System.out.println("Introduce la hora: ");
        int hora2 = scanner.nextInt();
        System.out.println("Introduce los minutos: ");
        int min2 = scanner.nextInt();
        System.out.println("Introduce los segundos: ");
        int seg2 = scanner.nextInt();

        System.out.println("Datos introducidos: momento inicial: " + hora1 + ":" + min1 + ":" + seg1 + "\t" + "momento final: " + hora2 + ":" + min2 + ":" + seg2);

        //TRUCO: PASAR A SEGUNDOS EL MOMENTO INICAL Y EL MOMENTO FINAL
        //pasamos a segundos el momento inical
        int hora1Seg = hora1 * 3600;
        int min1Seg = min1 *60;
        int momentoInicialSegundos = hora1Seg + min1Seg + seg1;
        System.out.println(momentoInicialSegundos);

        //pasamos a segundos el momento final
        int hora2Seg = hora1 * 3600;
        int min2Seg = min1 *60;
        int momentoFinalSegundos = hora2Seg + min2Seg + seg2;
        System.out.println(momentoFinalSegundos);

        //Hallar la diferencia entre ambos
        int diferenciaEnSeg = momentoFinalSegundos - momentoInicialSegundos;
        //extraigo los segundos
        int segundosDif = diferenciaEnSeg % 60;
        int minTotakesDif = diferenciaEnSeg / 60;
        //de esos min extraigo las horas
        int horasDiferencia = minTotakesDif / 60;



    }
}
