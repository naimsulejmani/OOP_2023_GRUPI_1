package inheritance.summary;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void push(T data) {
        elements.add(data);
    }

    public T pop() {
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        return elements.get(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }
}











