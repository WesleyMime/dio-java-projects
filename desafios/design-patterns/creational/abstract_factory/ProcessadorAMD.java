package creational.abstract_factory;

public class ProcessadorAMD implements Processador {

    @Override
    public void computar() {
        System.out.println("Utilizando processador da AMD.");
    }
}
