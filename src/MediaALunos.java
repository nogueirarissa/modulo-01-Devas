import java.util.Arrays;
import java.util.Scanner;

public class MediaALunos {
    public static double mediaIndividual (int numNotas, int idAluno){
        Scanner scan = new Scanner(System.in);
        double mediaNotaAluno = 0;
        for (int j = 0; j < numNotas; j++) {
            System.out.println("Digite a " + (j + 1) + "ª nota da " + (idAluno + 1) + "ª aluna: ");
            mediaNotaAluno += scan.nextDouble();
        }
        return mediaNotaAluno / numNotas;
    }
    public static double calculaEExibeMedia (double [] notaAlunos, int numAlunos) {
        double mediaGeral = 0;

        for (int i=0; i < numAlunos; i++){
            System.out.println("Aluno "+i+" - "+"Média "+notaAlunos[i]);
            mediaGeral += notaAlunos[i];
        }
        return mediaGeral/numAlunos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos alunas têm na turma: ");
        int numAlunos = scan.nextInt();
        System.out.println("Digite quantas notas cada aluna irá receber: ");
        int numNotas = scan.nextInt();

        double [] notaAlunos = new double [numAlunos];

        for ( int i=0; i < numAlunos; i++ ) {
            notaAlunos[i] = mediaIndividual(numNotas, i);
        }
        double mediaGeral = calculaEExibeMedia(notaAlunos, numAlunos);
        System.out.println("Média da turma: "+mediaGeral);

    }
}
