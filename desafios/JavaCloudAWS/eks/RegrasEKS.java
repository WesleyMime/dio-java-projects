package eks;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroTotalPods = scanner.nextInt();

        int numeroMinimoNodes = calcularNodes(numeroTotalPods);

        int numeroMinimoServidores = calcularServidores(numeroTotalPods);

        String mensagemNodes = numeroMinimoNodes == 1 ?
                "Recomendamos usar um unico node" :
                "Numero minimo de nodes:" + numeroMinimoNodes;

        System.out.println("1." + mensagemNodes);

        System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
        scanner.close();
    }

    private static int calcularNodes(int numeroTotalPods) {
        final double podsPorNode = 10;

        return (int) Math.ceil(numeroTotalPods/podsPorNode);
    }

    private static int calcularServidores(int numeroTotalPods) {
        final double podsPorServidor = 4;

        return (int) Math.ceil(numeroTotalPods / podsPorServidor);
    }
}