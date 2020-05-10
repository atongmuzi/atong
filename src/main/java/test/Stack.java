package test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {

    private Deque<T> stack = new ArrayDeque<>();

    public void push(T t) {
        stack.push(t);
    }

    public T peek(){
        return stack.peek();
    }

    public T pop(){
        return stack.pop();
    }
    @Override
    public String toString(){
        return stack.toString();
    }

}
