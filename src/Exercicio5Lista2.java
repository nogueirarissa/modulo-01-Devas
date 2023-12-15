import java.util.Scanner;

public class Exercicio5Lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o fatorial de qua número você deseja acessar: ");
        int numero = scan.nextInt();
        long fatorial = numero;

        if (fatorial == 0){
            System.out.println("O fatorial de 0 é 1");
        } else if (fatorial < 0) {
            System.out.println("Não existe fatorial para números negativos");
        } else {
            for (int i = (int) (fatorial - 1); i > 1 ; i-- ){
                fatorial *= i;
            }
            System.out.printf("%d! = %d",numero,fatorial);
        }
    }
}
