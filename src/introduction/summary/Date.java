package introduction.summary;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {

    }

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900)
            this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 13)
            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
    }

    public String toString() {
        return String.format("%d.%d.%d", getDay(), getMonth(), getYear());
    }
}











