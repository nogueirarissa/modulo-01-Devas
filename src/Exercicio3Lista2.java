import java.util.Scanner;

public class Exercicio3Lista2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas notas irá inserir: ");
        int contaNotas = scan.nextInt();

        double nota = 0;

        for (int i=0;  i < contaNotas; i++){
            System.out.println("Digite a " + (i+1) + "a nota: ");
            nota += scan.nextDouble();
        }
        System.out.printf("O valor da média é: %.2f", (nota/contaNotas));
    }
}
