package loops;

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("==========Version 2=============");
        for (int i = 0; i <=100 ; i+=2) {
            System.out.println(i);
        }
    }
}
