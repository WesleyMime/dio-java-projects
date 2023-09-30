package reuniaoAcionistas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        for (String analise : analises) {
            System.out.println(analise);
        }
    }
}

class SistemaAcionistas {

    private List<Analise> analises = new ArrayList<>();

    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        this.analises = simularAnalises(df);

        return filtrarAnalisesPorData(dataInicial, dataFinal);
    }

    private List<Analise> simularAnalises(SimpleDateFormat df) throws ParseException {
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));
        return analises;
    }

    private List<String> filtrarAnalisesPorData(Date dataInicial, Date dataFinal) {
        return this.analises.stream()
                .filter(analise ->
                        (analise.data.after(dataInicial) || analise.data.equals(dataInicial))
                                && (analise.data.before(dataFinal) || analise.data.equals(dataFinal)))
                .map(analise -> analise.descricao).toList();
    }

    static class Analise {
        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }
    }
}