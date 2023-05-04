package abstract_classes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Star();

//        Shape shape1 = new Shape();

//        if (shape instanceof Star) {
//            ((Star) shape).draw();
//        }

        shape.draw();
    }
}
