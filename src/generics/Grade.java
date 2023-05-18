package generics;

public class Grade implements Comparable<Grade> {
    private String name;
    private String surname;
    private int points;

    public Grade(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public int compareTo(Grade o) {
        return this.points - o.points;
    }
}
