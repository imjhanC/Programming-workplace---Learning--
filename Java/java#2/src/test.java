import java.util.*;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("EAT");
        list.add("MAKAN");
        list.add("BREAD");
        list.add("AIR");
        list.add("WATER");
        list.add("DICK");
        list.add("AKTAR");
        list.add("COCO");
        list.add("SLEEP");
        list.add("TIME");
        System.out.println("List before remove");
        displayCurrent(list);

        List<String> removeList = new ArrayList<String>();
        removeList.add("DICK");
        removeList.add("AIR");
        removeList.add("WATER");
        removeList.add("EAT");
        compare(list,removeList);
        System.out.println("List after remove");
        displayCurrent(list);
    }

    @SuppressWarnings("rawtypes")
    public static void displayCurrent(Collection collection1){
        Iterator<String> it = collection1.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toLowerCase()+" ");
        }
    }

    private static void compare(Collection<String> collection1,Collection<String> collection2){
        Iterator<String> it2 = collection1.iterator();
        while(it2.hasNext()){
            if(collection2.contains(it2.next())){
                it2.remove();
            }
        }
    }
}
