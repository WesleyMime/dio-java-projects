package custos;

import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        final double custoPorHoraServidor = 0.15;
        final double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);

        int quantidadeServidores = scanner.nextInt();
        int quantidadeBancosDados = scanner.nextInt();

        double custoTotal = calcularCusto(quantidadeServidores, quantidadeBancosDados);

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);
        scanner.close();
    }

    private static double calcularCusto(int quantidadeServidores, int quantidadeBancosDados) {
        return quantidadeServidores * 0.15 + quantidadeBancosDados * 0.05;
    }
}