import java.util.Arrays;
import java.util.Scanner;

public class AcumulaArray {

    public static int [] acumularArray (int [] arrayEntrada){

        int tamanhoArray = arrayEntrada.length;

        int [] novoNum = new int [tamanhoArray];

        novoNum[0] = arrayEntrada[0];

        int acumulaElementos = arrayEntrada[0];

        for (int i = 1; i < arrayEntrada.length; i++){
            acumulaElementos += arrayEntrada[i];
            novoNum[i] = acumulaElementos;
        }
       return novoNum;
    }
    public static int [] criaArrayInteiros (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos: ");
        int quantidadeElementos = scan.nextInt();

        int [] nums = new int[quantidadeElementos];

        for (int i = 0; i < quantidadeElementos; i++){
            System.out.println("Digite o "+(i+1)+"º elemento");
            nums [i] = scan.nextInt();
        }
         return nums;
    }

    public static void main(String[] args) {

        int [] array = criaArrayInteiros();
        int [] resultado = acumularArray(array);

        System.out.println(Arrays.toString(array)+"\n"+ Arrays.toString(resultado));

    }
}
