import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {
        DoubleProperty startDoubleProperty = DoubleProperty.of(20.0);
        StringProperty startStringProperty = StringProperty.of("Hello");

        Function<DoubleProperty, DoubleProperty> addToStartDoubleProperty = (n) -> {
            startDoubleProperty.plus(n);
            return startDoubleProperty;
        };

        Function<StringProperty, StringProperty> addToStartStringProperty = (s) -> {
            startStringProperty.plus(s);
            return startStringProperty;
        };
    }
}
