package monitoramento;

import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = contarEventosPorServico(scanner, quantidadeLogs);

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((s, l) -> System.out.println(s + ":"+ l));

        System.out.println("Maior:" + servicoComMaiorQuantidadeDeEventos(eventosPorServico));

        System.out.println("Menor:" + servicoComMenorQuantidadeDeEventos(eventosPorServico));
    }

    private static Map<String, Long> contarEventosPorServico(Scanner scanner, int quantidadeLogs) {
        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            if (eventosPorServico.containsKey(servico)) {
                Long quantidade = eventosPorServico.get(servico);
                eventosPorServico.put(servico, ++quantidade);
                continue;
            }
            eventosPorServico.put(servico, 1L);
        }
        return eventosPorServico;
    }

    private static String servicoComMaiorQuantidadeDeEventos(Map<String, Long> eventosPorServico) {
        Set<Map.Entry<String, Long>> eventosPorServicoSet = eventosPorServico.entrySet();

        return eventosPorServicoSet.stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    private static String servicoComMenorQuantidadeDeEventos(Map<String, Long> eventosPorServico) {
        Set<Map.Entry<String, Long>> eventosPorServicoSet = eventosPorServico.entrySet();

        return eventosPorServicoSet.stream()
                .min(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}