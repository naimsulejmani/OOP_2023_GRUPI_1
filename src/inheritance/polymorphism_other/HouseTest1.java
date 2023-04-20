package inheritance.polymorphism_other;

public class HouseTest1 {
    public static void main(String[] args) {
        //upcasting
        Object obj = new House(1, "bajgore", 123f);

//        if(obj instanceof House) {
//            System.out.println("Obj is a house!");
//        }
//        else
        if (obj instanceof Vila) {
            System.out.println("obj is a vila!");
        } else if (obj instanceof Cottage) {
            System.out.println("obj is a cottage!");
        } else if (obj instanceof House) {
            System.out.println("Obj is a house!");
        }


    }
}
