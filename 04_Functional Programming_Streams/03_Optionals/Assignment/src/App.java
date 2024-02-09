import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {
        int testNum = 1;

        Function<Integer, Integer> subtract5 = (num) -> num - 5;
        Function<Integer, Integer> times5 = (num) -> num * 5;
        Function<Integer, Integer> subtract5times5 = subtract5.andThen(times5);

        System.out.println(subtract5times5.apply(testNum));
    }

}
