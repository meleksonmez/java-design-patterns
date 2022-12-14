package pattern.abs.factory;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:48
 */
public abstract class AbstractFactory {

    abstract Shape getShape(ShapeEnums shapeType);

}
