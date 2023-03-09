package introduction.summary;

public class NewProductTest {
    public static void main(String[] args) {
        NewProduct p1 = new NewProduct();
        NewProduct p2 = new NewProduct();
        NewProduct p3 = new NewProduct();
        p1.setName("Monte Choko");
        p2.setName("Jogurt Jogobella");
        p3 = p2;
        p3.setName("Laptop");
        p3 = new NewProduct();
        System.out.println(p1.getName() + " shume e shijshme!");
        System.out.println(p2.getName() + " edhe kjo gjitashtu!");
        System.out.println(p3.getName() + " sharing is caring, and sharing is fun!");
        // p1.name = "Coca Cola e Shqiperise";
    }
}








