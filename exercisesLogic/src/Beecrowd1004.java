import java.util.Scanner;

public class Beecrowd1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2;
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();

        double PROD = valor1 * valor2;
        System.out.printf("prod = %.0f", PROD);

        sc.close();
    }
}
