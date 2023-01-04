import java.util.Locale;
import java.util.Scanner;

public class Beecrowd10111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int R = sc.nextInt();
        double pi = 3.14159;
        double calcRaio = (4.0/3) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\n", calcRaio);

        sc.close();
    }
}
