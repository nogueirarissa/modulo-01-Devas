public class Exercicio1Lista4 {
    public static int[] alternaArray(int[] A, int[] B) {
        int tamanhoArrays = A.length * 2;

        int[] resultado = new int[tamanhoArrays];

        int elementoArray = 0;

        for (int i = 0; i < A.length; i++) {
            resultado[elementoArray++] = A[i];
            resultado[elementoArray++] = B[i];
        }

        return resultado;
}

    public static void main(String[] args) {
        int [] A = {1,2,3,4};
        int [] B = {5,6,7,8};

        int [] resultado = alternaArray(A,B);

        for (int i: resultado){
            System.out.print(i+" ");
        }

    }
}
