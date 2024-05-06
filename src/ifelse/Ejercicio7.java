import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica");
        int notaMat = sc.nextInt();
        System.out.println("Ingrese la nota de fisica");
        int notaFis = sc.nextInt();
        System.out.println("Ingrese la nota quimica");
        int notaQui = sc.nextInt();

        if((notaMat>=65 && notaFis >= 55 && notaQui >= 50) || (notaMat + notaFis >= 140))
        {
            System.out.println("Admitido");
        }
        else {
            System.out.println("No admitido");
        }
    }
}
