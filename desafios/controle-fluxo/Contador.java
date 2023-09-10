import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            try {
                Scanner terminal = new Scanner(System.in);
                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro:");
                int parametroDois = terminal.nextInt();

                contar(parametroUm, parametroDois);

                System.out.println("Deseja continuar? (Y/N)");
                continuar = continuar(terminal.next());


            } catch (InputMismatchException exception) {
                System.out.println("Digite somente números.");

            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }
    }


    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }

    private static boolean continuar(String resposta) {
        return resposta.trim().equalsIgnoreCase("Y");
    }
}
