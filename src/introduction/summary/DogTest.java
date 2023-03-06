package introduction.summary;

public class DogTest {
    public static void main(String[] args) {
        int x = 10;
        Dog bandit = new Dog("Bandit", 23.4f, "ball");
        Dog hugo = new Dog("Hugo", 23.4f, "ball");
        bandit.fetch("shkopin");
        hugo.fetch("ball");

        System.out.println(bandit.getName());
        System.out.println(hugo.getName());

    }
}







