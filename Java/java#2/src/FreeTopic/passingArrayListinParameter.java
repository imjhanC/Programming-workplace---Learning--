package FreeTopic;
import java.util.*;
public class passingArrayListinParameter {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(57);
        list.add(9);
        addList(list);
        sortArray(list);
        display(list);

    }

    public static void addList(ArrayList<Integer> parameterList){ //addtoList
        parameterList.add(30);
        parameterList.add(50);
    }

    public static void display(ArrayList<Integer> List){   //display
        System.out.println(List);
    }

    public static void  sortArray(ArrayList<Integer> List){ //sorting
        List.sort(null);
    }
}
