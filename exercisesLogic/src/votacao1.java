import java.util.Scanner;

public class votacao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto = sc.nextInt();
        if(voto == 13){
            System.out.println("Você votou no candidato Luiz Inácio da Silva");
        }
        else if (voto == 22){
            System.out.println("Você votou no candidato Jair Messias Bolsonaro");
        }
    }
}
