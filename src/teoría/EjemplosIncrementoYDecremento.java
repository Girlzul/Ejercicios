package teoría;

public class EjemplosIncrementoYDecremento {
    public static void main(String[] args) {
        //De moemnto no le vamos a dar utilidad. Pero es util para bucles: for, while o do-while.

        int n = 10;
        System.out.println("1. " + n);
        // quiero aumentar una unidad
        n = n + 1;
        System.out.println( "2. " + n);
        //se puede hacer tambien asi:
        n++;
        System.out.println("3. " + n);
        //otra forma
        n+= 1; // es igual si pones (n*= 1)
        System.out.println("4. " + n);
        //se puede hacer al reves
        ++n;
        System.out.println("5. " + n);

        //lo mismo para decrecer. Se puede hacer de dos formas:
        n = n - 1;
        n--;
        n-= 1;
        --n;
        System.out.println("Decremento tras decremento... "+ n);

        //Diferencia entre prefijo ++ o sufijo
        int a = 4;
        int b = a++;//
        System.out.println(b);
        System.out.println(a);

        int c = 10;
        System.out.println("c++ " + c++);
        System.out.println("c: " + c);


    }
}
