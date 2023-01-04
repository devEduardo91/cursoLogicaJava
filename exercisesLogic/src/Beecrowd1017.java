import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int automovel = 12;
        int horas = sc.nextInt();
        int km = sc.nextInt();

        double gasto = (double)horas / automovel * km;
        System.out.printf("%.3f", gasto);

        sc.close();
    }
}
