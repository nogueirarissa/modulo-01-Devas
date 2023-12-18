import java.util.Arrays;
import java.util.Scanner;

public class SalarioVendedor {
    public static double salarioComComissao( double[] vendas) {
        double comissao = 0.05;
        return vendas[2] + (comissao * vendas [1]) + (vendas[0] * vendas[3]);
    }

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("""
                Digite respectivamente o número de carros vendidos no mês,
                o valor total de suas vendas no mês, seu salário fixo e o valor fixo que recebeu
                por carro vendido.\s""");
        System.out.println("---------------------------------------------------------------------------------");

        double [] vendas = new double [4];

        for (int i=0;  i < 4; i++){
            System.out.println("Digite " + (i+1) + "º valor: ");
            vendas [i] = scan.nextDouble();
        }
        double resultado = salarioComComissao(vendas);

        System.out.println("Entrada: "+(Arrays.toString(vendas)));
        System.out.printf("Saida: %.2f",resultado);

    }
}
