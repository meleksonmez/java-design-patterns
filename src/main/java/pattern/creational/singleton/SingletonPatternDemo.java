package pattern.creational.singleton;

/**
 * @author tcmsonmez
 * @created 27.12.2022 - 11:44
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }

}
