import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        Stack<String> list2 = new Stack<>();

        list.push("a");


        list2.push(list.pop());
        System.out.println(list2.toString());
        System.out.println((list));
        list2.clear();
    }
}
