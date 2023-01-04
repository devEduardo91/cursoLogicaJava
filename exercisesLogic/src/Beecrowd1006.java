import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pesoA, pesoB, pesoC;
        pesoA = 2.0;
        pesoB = 3.0;
        pesoC = 5.0;

        double multiPesos = A * pesoA;
        double multiPesos2 = B * pesoB;
        double multiPesos3 = C * pesoC;
        double somaMedia = multiPesos + multiPesos2 + multiPesos3;

        double somaPesos = pesoA + pesoB + pesoC;

        double media = somaMedia / somaPesos;

        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
