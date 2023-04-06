package inheritance.bird_app;

public class BirdTest {
    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        Parrot p2 = new Parrot("Papagalus", "white", "pasul");
        Goose g1 = new Goose("Goosajka", "zeze", "peshk!");


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(g1);
        Object obj = new Object();


        Bird aBird = new Parrot();
        Bird aBird1 = new Parrot("TEST", "mix", "pasul");
        Bird aBird2 = new Goose("uak", "white/black", "oriz");


//        aBird1.test();
//        aBird2.test1();
        System.out.println(aBird1.getCall());
        System.out.println(aBird2.getCall());
//        Parrot aParrot = new Bird("","","","");
    }
}




























