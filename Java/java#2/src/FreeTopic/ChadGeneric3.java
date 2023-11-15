package FreeTopic;
import java.util.*;
public class ChadGeneric3 {
    public static void main(String[] args){
        MyGenericClass1<Integer> myInt = new MyGenericClass1<>(1);
        MyGenericClass1<Double> myDouble = new MyGenericClass1<>(1.77);
        MyGenericClass1<Character> myChar = new MyGenericClass1<>('@');
        MyGenericClass1<String> myString = new MyGenericClass1<>("Hello");


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
