package pattern.abs.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:56
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(shapeFactory.getShape(ShapeEnums.RECTANGLE));
        shapeList.add(shapeFactory.getShape(ShapeEnums.SQUARE));

        shapeList.add(roundedShapeFactory.getShape(ShapeEnums.RECTANGLE));
        shapeList.add(roundedShapeFactory.getShape(ShapeEnums.SQUARE));

        shapeList.forEach(Shape::draw);
    }

}
