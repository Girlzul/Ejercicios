package teoría.BOOLEAN;

public class TeoríaBoolean {
    public static void main(String[] args) {
        boolean apto = true;
        System.out.println("¿Es apto? " + apto);

        //operadores lógicos
        //Unario: ! NOT

        System.out.println(!apto);//al poner ! cambia el sentido

        //Operadores binarios: se utilixan con 2 varianles
        //AND y
        System.out.println("AND");
        System.out.println("======");
        boolean v1 = true;
        boolean v2 = true;
        boolean and = v1 && v2;
        System.out.println(and);

        //OR O ||
        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        //XOR  ^
        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);

        boolean frío = false;
        boolean seco = true;
        boolean verano = false;
        boolean trekking =  seco && (!frío || verano);





    }
}
