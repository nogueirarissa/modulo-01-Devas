import java.util.Scanner;

public class Exercico4Lista2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite de qual número você deseja ver a tabuada: ");
        int numero = scan.nextInt();

        for (int i = 1 ; 1<= i && i <= 10; i++){
            System.out.println(numero+" X "+i+" = "+(numero * i));
        }
    }
}
