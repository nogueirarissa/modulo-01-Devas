import java.util.Arrays;
import java.util.Scanner;

public class CarroMaria {
    public static double [] custosCarro (double [] infoCar){
        double percentualDistribuidor = ((infoCar[1]/infoCar[0])*100);
        double percentualImpostos = ((infoCar[2]/infoCar[0])*100);

        percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
        percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;


        return new double[]{percentualDistribuidor, percentualImpostos};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] infoCar = new double [3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º valor: ");
            infoCar[i] = scan.nextDouble();
        }

        double [] percentuais = custosCarro(infoCar);

        System.out.println("Entrada: "+(Arrays.toString(infoCar)));
        System.out.println("Saída: "+ Arrays.toString(percentuais));
    }
}
