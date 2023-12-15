import java.util.Scanner;

public class CalculadoraCombustivelViagem {

    public static double calcularConsumoMedio (double velocidadeMedia, double tempoViagem, double AUTONOMIA){
        return (velocidadeMedia * tempoViagem)/AUTONOMIA;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final double AUTONOMIA = 12;

        System.out.println("Digite a velocidade média da viagem:");
        double velocidadeMedia = scan.nextDouble();

        System.out.println("Digite a duração da viagem em horas:");
        double tempoViagem = scan.nextDouble();

        double consumoMedio = calcularConsumoMedio(velocidadeMedia, tempoViagem, AUTONOMIA);

        System.out.printf("Joazinho, serão necessário %.3f litros para realizar a viagem.",consumoMedio);




    }

   /* Joãozinho quer calcular e mostrar a quantidade de
    litros de combustível gastos em uma viagem, ao utilizar um
    automóvel que faz 12 KM/L. Para isso, ele gostaria que você o
    auxiliasse através de um simples programa. Para efetuar o
    cálculo, deve-se fornecer o tempo gasto na viagem (em horas) ea velocidade média durante a mesma (em km/h). Assim,
    pode-se obter distância percorrida e, em seguida, calcular
    quantos litros seriam necessários. Mostre o valor com 3 casas
    decimais após o ponto.*/

}
