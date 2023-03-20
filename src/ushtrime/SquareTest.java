package ushtrime;

public class SquareTest {
    public static void main(String[] args) {
        Square sq1= new Square(3);
        Square sq2 = new Square(5);

        sq1.print();

        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.hasGreaterAreaThan(sq2));
        System.out.println(sq2.hasGreaterAreaThan(sq1 ));
    }
}
