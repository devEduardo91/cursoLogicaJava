import java.util.Locale;
import java.util.Scanner;
public class Beecrowd1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double numero = sc.nextDouble();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();
        System.out.printf("NUMBER = %.0f\n", numero);
        double salario = horasTrabalhadas * valorHora;
        System.out.printf("SALARY = U$ %.2f\n",salario);

        sc.close();
    }
}
