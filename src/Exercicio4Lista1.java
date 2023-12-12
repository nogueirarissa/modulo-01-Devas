import java.util.Scanner;

public class Exercicio4Lista1 {

    public static double calcularAreaRetangulo(double baseRetangulo, double alturaRetangulo) {
        return baseRetangulo * alturaRetangulo;
    }

    public static double calcularAreaTriangulo(double baseTriangulo, double alturaTriangulo) {
        return (baseTriangulo * alturaTriangulo) / 2;
    }

    public static double calcularAreaCirculo(double raioCirculo) {
        return Math.PI * Math.pow(raioCirculo, 2);
    }

    public static double calcularAreaTrapezio(double alturaTrapezio, double baseMenor, double baseMaior) {
        return ((baseMenor + baseMaior) * alturaTrapezio) / 2;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("\n Escolha qual figura geométrica você deseja calcular a área:\n");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Trapézio");
        System.out.println("---------------------------------------------------------------------");

        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Digite a altura do retângulo: ");
                double alturaRetangulo = scan.nextDouble();
                System.out.println("Digite o tamanho da base: ");
                double baseRetangulo = scan.nextDouble();
                System.out.println("A área total do triângulo é:" + calcularAreaRetangulo(alturaRetangulo, baseRetangulo));

                break;
            case 2:
                System.out.println("Digite a altura do triangulo: ");
                double alturaTriangulo = scan.nextDouble();
                System.out.println("Digite o tamanho da base: ");
                double baseTriangulo = scan.nextDouble();

                System.out.println("A área total do triângulo é:" + calcularAreaTriangulo(alturaTriangulo, baseTriangulo));

                break;
            case 3:
                System.out.println("Digite o raio do círculo: ");
                double raioCirculo = scan.nextDouble();

                System.out.println("A área total do círculo é:" + calcularAreaCirculo(raioCirculo));

                break;
            case 4:
                System.out.println("Digite a altura do trapézio: ");
                double alturaTrapezio = scan.nextDouble();
                System.out.println("Digite o tamanho da base menor: ");
                double baseMenor = scan.nextDouble();
                System.out.println("Digite o tamanho da base maior: ");
                double baseMaior = scan.nextDouble();

                if (baseMenor >= baseMaior){
                    System.out.println("Você digitou a base menor com valor maior que a base maior");
                    break;
                } else {
                    System.out.println("A área total do triângulo é: "+ calcularAreaTrapezio(alturaTrapezio, baseMenor, baseMaior));
                }

                break;

            default:
                System.out.println("\nOpção inválida. Tente novamente.\n");
        }
    }
}

