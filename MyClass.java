package HefShine;
import java.util.ArrayList;
public class MyClass {
    //StartOfMainMethod
    public static void main(String[] args) {
        mystack m = new mystack();
        m.add(5);
        m.add(10);
        m.add(15);
        m.add(5);
        m.add(10);
        m.add(15);
        m.print();
        m.pop();
        m.pop();
        m.print();
    }
    //EndOfMainMethod
}
class mystack {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void add(int data) {
        arr.add(data);
    }
    public void print() {
        System.out.println("Queue: " + arr);
    }
    public void pop() {
        if (arr.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        arr.remove(0);
    }
}