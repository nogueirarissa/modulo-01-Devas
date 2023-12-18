import java.util.Arrays;
import java.util.Scanner;

public class ReajusteSalarial {

    public static double calculoSalario( double[] dados) {

        double percentualReajustado = 0;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("""
                Digite respectivamente o tempo de serviço,
                a porcentagem da inflação e o salário do funcionário.""");
        System.out.println("---------------------------------------------------------------------------------");

        if (dados[0] <= 1 && dados[0] <5){
            percentualReajustado = (0.01 + (dados[1]/100));
        } else if (dados[0] <= 5 && dados[0] <10){
            percentualReajustado = (0.015 + (dados[1]/100));
        } else {
            percentualReajustado = (0.02 + (dados[1]/100));
        }

        return dados[2] + (dados[2]*percentualReajustado);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] dados = new double [3];

        for (int i=0;  i < 3; i++){
            System.out.println("Digite " + (i+1) + "º valor: ");
            dados [i] = scan.nextDouble();
        }
        double resultado = calculoSalario(dados);

        System.out.println("Entrada: "+(Arrays.toString(dados)));
        System.out.printf("Saida: %.2f",resultado);
    }
}
