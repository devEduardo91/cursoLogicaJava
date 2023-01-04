import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        double pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangulo = A * C / 2;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);

        double circulo = pi * Math.pow(C, 2.0);
        System.out.printf("CIRCULO: %.3f\n", circulo);

        double trapezio = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);

        double quadrado = Math.pow(B, 2.0);
        System.out.printf("QUADRADO: %.3f\n", quadrado);

        double retangulo = A * B;
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();
    }
}
