import java.util.ArrayList;
import java.util.Arrays;
public class LambdaOpertn {
    public static void main(String[] args) {
        String[] names={"sadhvi","harish","ram","krishna", "shubha"};
        var myList=new ArrayList<String>(Arrays.asList(names));

        // for(var s : myList)
		// {
		// 	System.out.println(s.toUpperCase());
		// }
		
		// System.out.println("myList contains :: "+myList);

        myList.replaceAll(s -> s.toUpperCase());
        myList.removeIf(s-> s.length() > 4);
        myList.forEach(System.out::println);
    }
}
