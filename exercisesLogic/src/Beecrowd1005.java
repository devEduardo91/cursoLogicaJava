import java.util.Scanner;

public class Beecrowd1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double peso1, peso2, notaA, notaB;

        notaA = sc.nextDouble();
        notaB = sc.nextDouble();
        peso1 = 3.5;
        peso2 = 7.5;

        double calc = notaA * peso1;
        double calc2 = notaB * peso2;
        double soma = peso1 + peso2;

        double somaCalcs = (calc + calc2) / soma;

        System.out.printf("MEDIA = %.5f",somaCalcs );


        sc.close();
    }
}
