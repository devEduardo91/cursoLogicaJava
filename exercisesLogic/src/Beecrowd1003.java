import java.util.Scanner;
public class Beecrowd1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, SOMA;
        A = sc.nextDouble();
        B = sc.nextDouble();

        SOMA = A + B;
        System.out.printf("SOMA = %.0f", SOMA);

        sc.close();
    }
}
