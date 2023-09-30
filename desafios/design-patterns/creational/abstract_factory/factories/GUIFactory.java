package creational.abstract_factory.factories;

import creational.abstract_factory.Button;
import creational.abstract_factory.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
