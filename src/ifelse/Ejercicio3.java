import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        if(n%3==0 && n%5==0)
        {
            System.out.println("Multiplo de 3 y 5");
        }
        else if (n%3 == 0) {
            System.out.println("Es multiplo de 3");
        }
        else if (n%5==0)
        {
            System.out.println("Es multiplo de 5");
        }
        else {
            System.out.println("El numero no es multiplo ni de 3 ni 5");
        }
    }
}
