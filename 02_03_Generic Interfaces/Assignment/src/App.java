public class App {
    public static void main(String[] args) throws Exception {

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());
        Property<Integer> myIProperty = new Property<Integer>();
        myIProperty.set(5);
        System.out.println(myIProperty.get());
        myIProperty.set(6);
        System.out.println(myIProperty.get());
        Property<Boolean> myBProperty = new Property<Boolean>();
        myBProperty.set(true);
        System.out.println(myBProperty.get());
        myBProperty.set(false);
        System.out.println(myBProperty.get());

    }
}