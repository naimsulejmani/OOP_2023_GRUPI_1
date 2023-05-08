package interfaces.adapters;

import java.util.ArrayList;

public interface Listable {
    public abstract void add(int number);

    void set(int index, int number);

    void remove(int index);

    void removeByValue(int value);

    int get(int index);

    ArrayList<Integer> getAll();
}




