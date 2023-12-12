import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio2Lista1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o seu nome:  \n");
        String nome = scan.nextLine();

        System.out.println("Digite o seu salário: ");
        float salario = scan.nextFloat();

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite a sua altura em metros: ");
        float altura = scan.nextFloat();

        System.out.println("Digite o seu sexo: ");
        String sexo = scan.next();

        System.out.printf("Prazer %s,\no salário informado foi: %.3f,\na idade informada foi de: %d anos,\na altura: %.2f metro(s)\ne o sexo: '%s' ",nome,salario,idade,altura,sexo);
    }
}
