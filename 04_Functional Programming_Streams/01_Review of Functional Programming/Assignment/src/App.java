public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(LawOfCosinesA.apply(1.0, 1.0, 1.0));
    }

    public static TriFunction<Double, Double, Double, Double> LawOfCosinesA = (a, b, c) -> {
        return Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
    };
} 
