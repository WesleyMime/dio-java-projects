package creational.abstract_factory.factories;

import creational.abstract_factory.Button;
import creational.abstract_factory.Checkbox;
import creational.abstract_factory.WindowsButton;
import creational.abstract_factory.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}