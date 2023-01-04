import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double codigo1 = sc.nextDouble();
        double peca1 = sc.nextDouble();
        double valor1 = sc.nextDouble();

        double codigo2 = sc.nextDouble();
        double peca2 = sc.nextDouble();
        double valor2 = sc.nextDouble();

        double multiplicacao = peca1 * valor1;
        double multiplicacao2 = peca2 * valor2;

        double totalPagar = multiplicacao + multiplicacao2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalPagar);

        sc.close();

    }
}
