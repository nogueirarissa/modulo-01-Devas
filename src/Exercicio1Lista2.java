import java.util.Scanner;

public class Exercicio1Lista2 {

    public static boolean verificarSePar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (verificarSePar(numero)) {
            if(numero >=2 && numero <=5){
                System.out.println("Not Weird");
            } else if (numero >= 6 && numero <= 20){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Weird");
        }
    }
}
