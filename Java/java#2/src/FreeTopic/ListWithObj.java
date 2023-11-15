package FreeTopic;
import java.util.*;
public class ListWithObj<T> {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("How many strings do you want to add to the list? ");  
        int numStrings = scanner.nextInt();  
        List<String> stringList = new ArrayList<String>();  
        for (int i = 0; i < numStrings; i++) {  
            System.out.print("Enter string " + (i+1) + ": ");  
            String inputString = scanner.next();  
            stringList.add(inputString);  
        }  
        System.out.println("The strings in the list are:");  
        for (String str : stringList) {  
            System.out.println(str);  
        }  
    }  
}
