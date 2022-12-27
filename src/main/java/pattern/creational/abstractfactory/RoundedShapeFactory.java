package pattern.creational.abstractfactory;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:51
 */
public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnums shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals(ShapeEnums.RECTANGLE)) {
            return new RoundedRectangle();
        } else if (shapeType.equals(ShapeEnums.SQUARE)) {
            return new RoundedSquare();
        }
        return null;
    }

}
