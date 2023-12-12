import java.util.Scanner;

public class Exercicio5Lista1 {

    public static double calculaImc (double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu peso em quilogramas: ");
        double peso = scan.nextDouble();

        System.out.println("Digite o sua altura em metros: ");
        double altura = scan.nextDouble();

        if (calculaImc(peso, altura) < 18.5){
            System.out.println("Cuidado! O Paciente está desnutrido");
        } else if (calculaImc(peso, altura) >= 18.5 && calculaImc(peso, altura) <= 24.9){
            System.out.println("O Paciente está com o IMC no padrão normal");
        } else if (calculaImc(peso, altura) > 24.9 && calculaImc(peso, altura) <= 29.9){
            System.out.println("O Paciente está com sobrepeso, grau de obesidade I");
        } else if (calculaImc(peso, altura) > 29.9 && calculaImc(peso, altura) <= 39.9){
            System.out.println("O Paciente está com obesidade, grau II");
        } else {
            System.out.println("O Paciente está com obesidade, grau III");
        }
    }
}
