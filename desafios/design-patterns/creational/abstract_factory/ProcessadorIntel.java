package creational.abstract_factory;

public class ProcessadorIntel implements Processador {

    @Override
    public void computar() {
        System.out.println("Utilizando processador da Intel.");
    }
}
