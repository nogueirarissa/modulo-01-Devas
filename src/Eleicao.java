import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eleicao {
    public static int apuracaoEleicao(int[] arrayDeVotos) {
        int indiceVencedor = -1;
        int maiorVoto = -1;
        for (int i = 0 ; i < 4; i++) {
            if(arrayDeVotos[i] > maiorVoto) {
                maiorVoto = arrayDeVotos[i];
                indiceVencedor = i;
            }
        }
        return indiceVencedor;
    }

    public static void main(String[] args) {
        Map<String, Integer> eleicao = new HashMap<>();

        int [] votoCandidatos = {0, 0, 0, 0};

        eleicao.put("A", 1);
        eleicao.put("B", 2);
        eleicao.put("C", 3);
        eleicao.put("Nulo", 0);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do seu Candidato:");
            String votoUnico = scan.next();

            if (eleicao.containsKey(votoUnico) && !votoUnico.equals("Nulo")) {
                votoCandidatos[eleicao.get(votoUnico)] += 1;
            }
        }

        int indiceVencedor = apuracaoEleicao(votoCandidatos);

        for (String i : eleicao.keySet()) {
            if(indiceVencedor == 0) {
                System.out.println("Todos os votos foram nulos.");
                break;
            }else if (eleicao.get(i) == indiceVencedor){
                System.out.println(i + " foi quem venceu com " + (votoCandidatos[indiceVencedor] * 10) + "% dos votos");
                break;
            }
        }
    }
}

