package interfaces.adapters;

import java.util.ArrayList;

public class BleronList extends AdapterList {
    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    public void add(int number) {
        numbers.add(number);
    }

    @Override
    public ArrayList<Integer> getAll() {
        return numbers;
    }
}
