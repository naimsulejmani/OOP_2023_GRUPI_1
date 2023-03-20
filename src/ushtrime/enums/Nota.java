package ushtrime.enums;

public enum Nota {
    DOBET(1, "Dobet"),
    MJAFTUESHEM(2, "Mjaftueshem"),
    MIRE(3, "Mire"),
    SHUME_MIRE(4, "Shume mire"),
    SHKELQYESHEM(5, "Shkelqyeshem");
    private final int value;
    private final String name;

    private Nota(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}













