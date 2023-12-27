package FreeTopic;
import java.util.*;
public class ArrayListMinSearch{
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("the ArrayList is empty");
        }

        E min =list.get(0);

        for(int i = 0; i < list.size(); i++){
            E current  =list.get(i);
            if(current.compareTo(min) < 0){
                min = current;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(1);
        num.add(8);
        num.add(4);
        num.add(0);


        Integer minNumInteger = min(num);
        System.out.println("The minimum number is : " +minNumInteger);
    }
}
