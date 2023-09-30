package creational.abstract_factory.factories;

import creational.abstract_factory.Button;
import creational.abstract_factory.Checkbox;
import creational.abstract_factory.MacOSButton;
import creational.abstract_factory.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}