package pattern.creational.abstractfactory;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:55
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }

}
