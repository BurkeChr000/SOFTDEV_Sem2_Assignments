public class StringProperty {
    
    private String value;

    private StringProperty(String value) {
        this.value = value;
    }

    public static StringProperty of(String value){
        return new StringProperty(value);
    }

    public String get() {
        return value;
    }

    public void set(String value){
        this.value = value;
    }

    public StringProperty plus(StringProperty value) {
        this.value += value.get();
        return this;
    }

    public Double getDouble() {
        return Double.parseDouble(value);
    }
}
