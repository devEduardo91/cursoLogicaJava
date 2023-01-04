package estruturaCondicional.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double c1, c2,c3, c4, c5;
        c1 = 4.00;
        c2 = 4.50;
        c3 = 5.00;
        c4 = 2.00;
        c5 = 1.50;

        if (codigo == 1){
            double multiplicacao = c1 * quantidade;
            System.out.printf("Total = %.2f\n", multiplicacao);
        }
        else if (codigo == 2){
            double multiplicacao = c2 * quantidade;
            System.out.printf("Total = %.2f\n", multiplicacao);
        }
        else if (codigo == 3){
            double multiplicacao = c3 * quantidade;
            System.out.printf("Total = %.2f\n", multiplicacao);
        }
        else if (codigo == 4){
            double multiplicacao = c4 * quantidade;
            System.out.printf("Total = %.2f\n", multiplicacao);
        }
        else if (codigo == 5){
            double multiplicacao = c5 * quantidade;
            System.out.printf("Total = %.2f\n", multiplicacao);
        }

        sc.close();
    }
}
