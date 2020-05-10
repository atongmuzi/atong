package test;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        for(String s:"I love you".split(" ")){

            stringStack.push(s);
            System.out.println(stringStack.toString());
            System.out.println(stringStack.peek());
        }
    }
}
