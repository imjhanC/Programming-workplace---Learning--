package Practical4;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
public class Practical4Q4 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Dog");
        list.add("Cat");
        list.add("Tiger");
        list.add("Goat");
        list.add("Elephant");
        list.add("Lion");
        list.add("Fish");
        list.add("Cow");

        LinkedList<String> listremove = new LinkedList<>();
        printAnimalName(list);
        listremove.add("Lion");
        listremove.add("Fish");
        listremove.add("Goat");
        removeNames(list, listremove);
        printAnimalName(list);
    }

    public static void printAnimalName(Collection c){
        Iterator<String> it =c.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toUpperCase()+" ");
        }
        System.out.println();
    }

    private static void removeNames (Collection<String> collection1,Collection<String> collection2){
        Iterator<String> itremove = collection1.iterator();
        while(itremove.hasNext()){
            if(collection2.contains(itremove.next()))
                itremove.remove();
        }
    }
}
