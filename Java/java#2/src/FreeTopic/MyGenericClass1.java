package FreeTopic;
public class MyGenericClass1 <T>{
    T x;

    MyGenericClass1(T x){
        this.x = x;
    }

    public T getValue(){
        return x;
    }
}
