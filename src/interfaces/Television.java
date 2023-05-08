package interfaces;

import java.util.Comparator;

public class Television implements Comparator<Television> {

    private int id;
    private float inches;

    @Override
    public int compare(Television o1, Television o2) {
        return 0;
    }
}
