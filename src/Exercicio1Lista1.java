import java.util.Scanner;

public class Exercicio1Lista1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o seu nome:  \n");
        String nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite a sua profissão: ");
        String profissao = scan.nextLine();

        System.out.printf("Prazer %s, a idade informada foi de: %d anos e a profissão de: '%s' ",nome,idade,profissao);


    }

}

