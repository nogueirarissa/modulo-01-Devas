import java.util.Scanner;

public class Exercicio2Lista2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha qual operação você deseja realizar: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Resto");
        System.out.println("6 - Raiz");
        System.out.println("7 - Potência");

        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o primeiro número: ");
                double numero1 = scan.nextDouble();
                System.out.println("Digite o segundo número");
                double numero2 = scan.nextDouble();

                System.out.println("A soma é: "+(numero1 + numero2));
                break;
            case 2:
                System.out.println("Digite o minuendo: ");
                double minuendo = scan.nextDouble();
                System.out.println("Digite o subtraendo: ");
                double subtraendo = scan.nextDouble();

                System.out.println("A subtração é: "+ (minuendo - subtraendo));
                break;
            case 3:
                System.out.println("Digite o numero que deseja dividir: ");
                double dividendo = scan.nextDouble();
                System.out.println("Digite o divisor: ");
                double divisor = scan.nextDouble();

                if (divisor == 0) {
                    System.out.println("Um número não pode ser dividido por 0. Por favor digite um número válido e tente novamente.");
                } else {
                    System.out.println("A divisão é: " + (dividendo / divisor));
                }
                break;
            case 4:
                System.out.println("Digite um número: ");
                double fator1 = scan.nextDouble();
                System.out.println("Digite um número: ");
                double fator2 = scan.nextDouble();

                System.out.println("O produto é: "+ ( fator1 * fator2));
                break;
            case 5:
                System.out.println("Digite um número: ");
                double divisorResto = scan.nextDouble();
                System.out.println("Digite um número: ");
                double dividendoResto = scan.nextDouble();

                System.out.println("O resto da divisão é: "+ ( divisorResto % dividendoResto));
                break;
            case 6:
                System.out.println("Digite o radicando: ");
                double radicando  = scan.nextDouble();
                System.out.println("Digite o radical:  ");
                double radical = scan.nextDouble();

                System.out.println("A raiz é: "+ Math.pow(radicando,(1/radical)));
                break;
            case 7:
                System.out.println("Digite a base: ");
                double base  = scan.nextDouble();
                System.out.println("Digite o expoente:  ");
                double expoente = scan.nextDouble();

                System.out.println("A potência é: "+ Math.pow(base, expoente));
                break;

            default:
                System.out.println("\nOpção inválida. Tente novamente.\n");

        }

    }
}
