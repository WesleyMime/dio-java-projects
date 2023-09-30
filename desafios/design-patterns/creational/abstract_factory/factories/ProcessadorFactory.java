package creational.abstract_factory.factories;

import creational.abstract_factory.Processador;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface ProcessadorFactory {
    Processador criarProcessador();
}