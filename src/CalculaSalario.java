import java.util.Scanner;

public class CalculaSalario {
    public static double calcularSalarioAnual(double valorHora, double horasTrabalhadasMes) {
        return (valorHora * horasTrabalhadasMes)*12;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Quantas horas você trabalhou por mês: ");
        double horasTrabalhadasMes = scan.nextDouble();

        System.out.println("Digite o valor recebido por hora trabalhada:");
        double valorHora = scan.nextDouble();

        double salarioAnual = calcularSalarioAnual(valorHora, horasTrabalhadasMes);
        System.out.printf("%s o valor do seu salário anual é %.2f",nome, salarioAnual);

    }

}
