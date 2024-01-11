import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter your dividend");
        String dividendString = input.next();
        System.out.println ("Enter your divisor");
        String divisorString = input.next();
        input.close();
       divideNums(dividendString, divisorString);
    }

    public static void divideNums(String dividend, String divisor){
        double dividendNum = 0;
        double divisorNum = 1;
    
        try {
            dividendNum = Double.parseDouble(dividend);
            divisorNum = Double.parseDouble(divisor);

            if (divisorNum == 0){
                throw new DivisorZeroException(String.format("You can't divide by zero"));
            }
        } catch (DivisorZeroException ex){
            dividendNum = 0;
            divisorNum = 1;
            System.out.println(ex.getMessage());
            System.out.println("Returning default of values of dividend and divisor instead");
        } catch (NumberFormatException ex){
            dividendNum = 0;
            divisorNum = 1;
            System.out.println("Didn't print proper number for either the divisor or quotient");
            System.out.println("Returning default of values of dividend and divisor instead");
        } finally {
            double quotient = dividendNum / divisorNum;
            System.out.println(String.format("%s divided by %s is %s", dividendNum, divisorNum, quotient));
        }
    }
}