import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int percentual = 15;
        String nome = sc.next();
        double salario = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double percentualAumento = (double) totalVendas * percentual/100;
        double aumentoSalarial = salario + percentualAumento;

        System.out.printf("TOTAL = %.2f\n", aumentoSalarial);

        sc.close();
    }
}
