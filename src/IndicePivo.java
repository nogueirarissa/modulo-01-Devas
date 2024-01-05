import java.util.Arrays;

public class IndicePivo {
    public static int indicePivot(int[] nums) {
        int somaTotal = 0;
        int somaEsquerda = 0;
        int somaDireita = 0;

        for ( int i : nums){
            somaTotal += i;
        }

        for (int i = 0; i < nums.length; i++){
            somaDireita = somaTotal - nums[i] - somaEsquerda;
            if (somaEsquerda == somaDireita){
                return i;
            }
            somaEsquerda += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int resultado = indicePivot(new int []{1,7,3,6,5,6});
        System.out.println(resultado);
    }
}
