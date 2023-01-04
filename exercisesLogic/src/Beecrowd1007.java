import java.util.Scanner;

public class Beecrowd1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, D;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();

        double DIFERENCA = A * B - C * D;
        System.out.printf("DIFERENCA = %.0f", DIFERENCA);

        sc.close();
    }
}
