import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Calculadora {

    public static int somar (int[] numerosParaSomar){
        int soma = 0;
        for ( int i : numerosParaSomar){
            soma += i;
        }
        return soma;
    }

    public static double subtrair (double [] numerosParaSubtrair){
        double subtração = numerosParaSubtrair[0];

        for (int i = 1; i < numerosParaSubtrair.length; i++){
            subtração -= numerosParaSubtrair[i];
        }
        return subtração;
    }

    public static double dividir (double [] numerosParaDividir){
        double divisao = numerosParaDividir[0];
        for (int i = 1; i < numerosParaDividir.length; i++) {
                divisao /= numerosParaDividir[i];
            }
        return divisao;
    }

    public static double multiplicar (double [] numerosParaMultiplicar){
        double multiplicacao = 1;
        for ( double i : numerosParaMultiplicar){
            multiplicacao *= i;
        }
        return multiplicacao ;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha qual operação você deseja realizar: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantos números deseja somar?");
                int numero = scan.nextInt();

                int [] numerosParaSomar = new int [numero];

                for (int i = 0; i < numero; i++){
                    System.out.printf("Digite o %dº número: ",(i +1));
                    numerosParaSomar [i] = scan.nextInt();
                }
                int resultadoSoma = somar(numerosParaSomar);
                System.out.printf("O resultado é %d", resultadoSoma);

                break;

            case 2:
                System.out.println("Quantos numeros você deseja subtrair?");
                int numeroSub = scan.nextInt();

                double [] numerosParaSubtrair = new double [numeroSub];

                for (int i =0; i < numeroSub; i++){
                    System.out.printf("Digite o %dº número: ",(i +1));
                    numerosParaSubtrair [i] = scan.nextDouble();
                }
                double resultadoSub = subtrair(numerosParaSubtrair);
                System.out.printf("O resultado da subtração é %.2f",resultadoSub);
                break;

            case 3:
                System.out.println("Digite quantas divisões irá realizar:");
                int numeroDiv = scan.nextInt();

                double [] numerosParaDividir = new double [numeroDiv];
                for (int i = 0; i<numeroDiv; i++){
                    System.out.printf("Digite o %dº número: ",(i+1));
                    numerosParaDividir [i] = scan.nextDouble();
                }
                double resultadoDiv = dividir(numerosParaDividir);
                if (resultadoDiv == Double.POSITIVE_INFINITY){
                    System.out.println("Não é possivel fazer divisão por 0");
                }else {
                    System.out.printf("O resultado da divisão é %.2f", resultadoDiv);
                    break;
                }
            case 4:
                System.out.println("Digite quantos números deseja multiplicar:");
                int numerosMult = scan.nextInt();

                double [] numerosParaMultiplicar = new double [numerosMult];

                for (int i = 0; i < numerosMult; i++ ){
                    System.out.printf("Digite o %dº número: ",(i+1));
                    numerosParaMultiplicar[i] = scan.nextDouble();
                }
                double resultadoMult = multiplicar(numerosParaMultiplicar);
                System.out.println("O resultado da multiplicação é: "+resultadoMult);
                break;

            default:
                System.out.println("Opção inválida.");
        }

    }

}
