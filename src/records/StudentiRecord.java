package records;

public record StudentiRecord(String name, int id) {
    public StudentiRecord {
        if (id < 0) throw new IllegalArgumentException("Vlera negative!");
    }
}
