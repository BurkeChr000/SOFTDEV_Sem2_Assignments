import java.util.List;
import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {
        Function<String, String> toLowerCase = (s) -> s.toLowerCase();
        
        List<Integer> myList = List.of(1, 2, 3);

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        System.out.println(cumulativeSum);
        
        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        List<String> schedule = List.of("Econ", "English", "Physics", "CS1", "Jap", "CS2", "Calc");

        List<String> lowerCaseSchedule = schedule.stream().map(toLowerCase).toList();
        System.out.println(lowerCaseSchedule);

        //create  a list of strings.  
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)


    }
}
