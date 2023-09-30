package creational.abstract_factory.factories;

import creational.abstract_factory.Processador;
import creational.abstract_factory.ProcessadorAMD;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class AMDFactory implements ProcessadorFactory {

    @Override
    public Processador criarProcessador() {
        return new ProcessadorAMD();
    }
}
