package Practical4;
import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.Iterator;
public class Practical4Q2 {
    public static void main(String[] args){
        String[] colors = {"MAGENTA", "RED", "WHITE", "GREEN", "BLUE","CYAN"};

        List<String> list = new ArrayList<String>();

        for(String color : colors){
            list.add(color);
        }

        String[]removeColors = {"RED", "WHITE", "GREEN", "BLUE"};
        List<String> removeList = new ArrayList<String>();
        for(String color : removeColors){
            removeList.add(color);
        }


        System.out.println("Print without Iterator: " + list);
        System.out.println();

        System.out.println("Print with iterator");

        Iterator <String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + ",");
        }

        System.out.println();


        removeColors(list,removeList);

        System.out.println("ArrayList after calling removeColors :"); 

        Iterator<String> itremove = list.iterator();
        while(itremove.hasNext()){
            System.out.println(itremove.next()+",");
        }

        System.out.println();
    }

    private static void removeColors(Collection<String> collection1,Collection<String> collection2){
        Iterator<String> it2 = collection1.iterator();
        while(it2.hasNext()){
            if(collection2.contains(it2.next()))
                it2.remove();
        }
    }
}
