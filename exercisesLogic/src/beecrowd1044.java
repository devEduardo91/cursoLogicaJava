package estruturaCondicional.estruturaCondicional.estruturaCondicional;

import java.util.Scanner;

public class beecrowd1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
        sc.close();
    }
}
