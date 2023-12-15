import java.util.Scanner;

public class ConversorTemperatura {

    public static double converterTemperatura(double temperaturaAtual, String medidaAtual, String medidaFinal) {
        if (medidaAtual.equals(medidaFinal)) {
            return temperaturaAtual;
        } else if (medidaAtual.equals("celsius")) {
            if (medidaFinal.equals("fahrenheit")) {
                return (temperaturaAtual * 9 / 5) + 32;
            } else if (medidaFinal.equals("kelvin")) {
                return temperaturaAtual + 273.15;
            }
        } else if (medidaAtual.equals("fahrenheit")) {
            if (medidaFinal.equals("celsius")) {
                return (temperaturaAtual - 32) * 5 / 9;
            } else if (medidaFinal.equals("kelvin")) {
                return (temperaturaAtual + 459.67) * 5 / 9;
            }
        } else if (medidaAtual.equals("kelvin")){
            if (medidaFinal.equals("celsius")) {
                return temperaturaAtual - 273.15;
            } else if (medidaFinal.equals("fahrenheit")) {
                return (temperaturaAtual * 9 / 5) - 459.67;
            }
        } else {
            System.out.println("Entrada invalida. Verifique se houve erro de digitação e tente novamente.");
            System.exit(0);
        }
        return temperaturaAtual;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura atual:");
        double temperaturaAtual = scanner.nextDouble();

        System.out.println("Digite a medida atual (celsius, fahrenheit, kelvin):");
        String medidaAtual = scanner.next().toLowerCase();

        System.out.println("Digite a medida final (celsius, fahrenheit, kelvin):");
        String medidaFinal = scanner.next().toLowerCase();

        double resultado = converterTemperatura(temperaturaAtual, medidaAtual, medidaFinal);

        System.out.printf("%.2fº %s é equivalente a %.2fº %s. ",temperaturaAtual, medidaAtual, resultado, medidaFinal);
    }
}