package pattern.creational.singleton;

/**
 * @author tcmsonmez
 * @created 27.12.2022 - 11:42
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
