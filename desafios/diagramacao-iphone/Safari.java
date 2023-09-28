import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Safari implements NavegadorInternet {

    private final Map<Integer, String> abas = new HashMap<>();

    @Override
    public void exibirPagina(Integer numero) {
        String url = abas.getOrDefault(numero, "");
        System.out.printf("Exibindo página de url %s.\n", url);
    }

    @Override
    public Integer adicionarAba(String url) {
        Integer numero = new Random().nextInt(0, Integer.MAX_VALUE);
        abas.put(numero, url);
        System.out.printf("Adicionando aba número %d com url %s.\n", numero, url);
        return numero;
    }

    @Override
    public void removerAba(Integer numero) {
        abas.remove(numero);
        System.out.printf("Removendo aba número %d.\n", numero);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
