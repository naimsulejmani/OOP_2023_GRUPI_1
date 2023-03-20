package ushtrime;

public class Square {
    private double a = 1.0;

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
        else
            System.out.println("Nuk lejohet te jete vlera 0 ose ma e vogel");
    }

    public void print() {
        System.out.println("---");
        System.out.println("I I");
        System.out.println("---");


    }

    public double getArea() {
        return a * a;
    }


    public double getPerimeter() {
        return 4 * a;
    }

    public boolean hasGreaterAreaThan(Square otherSquare) {
        return a > otherSquare.a;
    }


}
