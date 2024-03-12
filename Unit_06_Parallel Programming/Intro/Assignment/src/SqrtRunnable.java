<<<<<<< HEAD
public class SqrtRunnable  implements Runnable{
    
    private Thread t;
    private double num;

    SqrtRunnable(double num) {
        this.num = num;
=======
public class SqrtRunnable implements Runnable {

    private Thread t;
    private double number;

    SqrtRunnable(double number) {
        this.number = number;
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
    }

    @Override
    public void run() {
<<<<<<< HEAD
        System.out.println("sqrt of " + num + " equals " + Math.sqrt(num));
=======
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
<<<<<<< HEAD
=======

>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
}
