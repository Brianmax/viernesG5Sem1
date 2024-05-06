import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int primerNumero = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundoNumero = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int tercerNumero = sc.nextInt();

        if(primerNumero > segundoNumero)
        {
            if(primerNumero > tercerNumero)
            {
                System.out.println(primerNumero);
            }
        } else if (segundoNumero > tercerNumero) {
            System.out.println(segundoNumero);
        }
        else {
            System.out.println(tercerNumero);
        }
    }
}
