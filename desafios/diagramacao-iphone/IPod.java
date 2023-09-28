import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IPod implements ReprodutorMidia {

    private final List<String> midia = new ArrayList<>();

    private Integer idMidiaSelecionada = 0;

    @Override
    public void reproduzir() {
        for (int i = idMidiaSelecionada; i < midia.size(); i++) {
            System.out.printf("Reproduzindo mídia de nome %s.\n", midia.get(i));
        }
    }

    @Override
    public void pausar() {
        System.out.println("Pausando mídia.");
    }

    @Override
    public void selecionar(Integer numero) {
        this.idMidiaSelecionada = numero - 1;
        System.out.printf("Selecionando mídia de número %d.\n", numero);
    }

    @Override
    public void adicionar(String nome) {
        this.midia.add(nome);
        System.out.printf("Adicionando mídia de nome %s.\n", nome);
    }

    @Override
    public void embaralhar() {
        System.out.println("Embaralhando mídia.");
        midia.sort((o1, o2) -> new Random().nextInt());
        idMidiaSelecionada = 0;
    }

}
