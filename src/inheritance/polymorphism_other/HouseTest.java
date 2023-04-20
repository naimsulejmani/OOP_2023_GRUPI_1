package inheritance.polymorphism_other;

import java.awt.*;

public class HouseTest {
    public static void main(String[] args) {
        //upcasting
        House h1 = new Vila(1, "rr. Sami Frasheri nr. 1", 102.23f);
        House h2 = new Cottage(2, "rr. Nena tereze nr. 3", 55.5f);
        Object h3 = new Vila(3, "rr. Iljaz Kodra nr. 12", 100.90f);
        testInstanceOf(h1);
        testInstanceOf(h2);
        testInstanceOf(h3);





        if (h3 instanceof Vila) {
            Vila h3_1 = (Vila) h3; //down_casting
        }
        else if(h3 instanceof Cottage) {
            Cottage h3_2 = (Cottage) h3;
        }

        House h3_3 = (House)h3;
    }

    public static void testInstanceOf(Object object) {
        if (object instanceof House) {
            System.out.println("It's a house!");
        }
        if (object instanceof Vila) {
            System.out.println("It's also a Vila");
        }
        if (object instanceof Cottage) {
            System.out.println("It's also a Cottage");
        }
    }

    public static void testInstanceOf(House house) {
        if (house instanceof Vila) {
            System.out.println("Vila");
        } else if (house instanceof Cottage) {
            System.out.println("Cottage");
        } else {
            System.out.println("House");
        }
    }
}









