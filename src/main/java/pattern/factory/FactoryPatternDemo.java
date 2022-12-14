package pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tcmsonmez
 * @created 14.12.2022 - 16:40
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(shapeFactory.getShape(ShapeEnums.CIRCLE));
        shapeList.add(shapeFactory.getShape(ShapeEnums.RECTANGLE));
        shapeList.add(shapeFactory.getShape(ShapeEnums.SQUARE));

        shapeList.forEach(Shape::draw);
    }

}
