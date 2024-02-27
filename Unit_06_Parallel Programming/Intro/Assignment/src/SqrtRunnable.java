public class SqrtRunnable  implements Runnable{
    
    private Thread t;
    private double num;

    SqrtRunnable(double num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.print(Math.sqrt(num));
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}