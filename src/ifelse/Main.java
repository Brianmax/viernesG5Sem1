public class Main {
    public static void main(String[] args) {
        System.out.println(15%2);
        System.out.println(28%2);

        // declarando variable boolean
        boolean miVariable = false;
        System.out.println(15 > 3);
        System.out.println(15 < 12);

        boolean resultado = 10 > 3;
        System.out.println(resultado);
        System.out.println(10 >= 10);
        System.out.println(10 > 10);
        System.out.println(24 == 24);
        System.out.println(21 == 23); // false

        System.out.println(21 != 34); // true
        System.out.println(21 != 21); // false

        // operadores logicos
        System.out.println("-------Operadores Logicos---------");
        System.out.println("---Operador and---");
        System.out.println(true && true); // true
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("------Opeardor or -------");
        System.out.println(true || false); // true
        System.out.println(true || true); // true
        System.out.println(false || false); // false

        System.out.println((true || false) && false);
    }
}