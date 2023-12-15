import java.util.Scanner;

public class Fatorial {

    public static long calculaFatorial (long numero){
        if (numero == 0){
            System.out.println("O fatorial de 0 é 1");
        } else if (numero < 0) {
            System.out.println("Não existe fatorial para números negativos");
        } else {
            for (int i = (int) (numero - 1); i > 1; i--) {
                numero *= i;
            }
        }
            return numero;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número do qual você deseja calcular o fatorial: ");
        int numero = scan.nextInt();

        long resultado = calculaFatorial(numero);

        System.out.printf("%d! = %d",numero,resultado);
    }
}
