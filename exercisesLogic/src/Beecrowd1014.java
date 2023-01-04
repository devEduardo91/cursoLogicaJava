import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double X, Y, calculo;
        X = sc.nextDouble();
        Y = sc.nextDouble();

        calculo = X / Y;
        System.out.printf("%.3f km/l", calculo);

        sc.close();
    }
}
