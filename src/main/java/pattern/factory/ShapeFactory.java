package pattern.factory;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:35
 */
public class ShapeFactory {

    public Shape getShape(ShapeEnums shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals(ShapeEnums.CIRCLE)) {
            return new Circle();
        } else if (shapeType.equals(ShapeEnums.RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equals(ShapeEnums.SQUARE)) {
            return new Square();
        }
        return null;
    }

}
