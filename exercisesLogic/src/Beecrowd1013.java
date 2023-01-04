import java.util.Scanner;

public class Beecrowd1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int A, B ,C, maiorAB;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        maiorAB = (A + B + Math.abs(A -B)) / 2;

        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorABC + " eh o maior");

        sc.close();
    }
}
