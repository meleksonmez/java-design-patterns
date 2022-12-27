package pattern.creational.abstractfactory;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:49
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnums shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals(ShapeEnums.RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equals(ShapeEnums.SQUARE)) {
            return new Square();
        }
        return null;
    }

}
