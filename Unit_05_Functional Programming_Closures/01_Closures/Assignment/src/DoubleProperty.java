public class DoubleProperty {
    
    private double value;

    private DoubleProperty(double value) {
        this.value = value;
    }

    public static DoubleProperty of(double value){
        return new DoubleProperty(value);
    }

    public double get() {
        return value;
    }

    public void set(double value){
        this.value = value;
    }

    public DoubleProperty plus(DoubleProperty value) {
        this.value += value.get();
        return this;
    }

    public DoubleProperty minus(DoubleProperty value) {
        this.value -= value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
