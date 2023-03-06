package introduction.summary;

public class Dog {
    // variablat instance, atributet, data members (private)
    private String name;
    private float weight;
    private String favouriteToy;


    //KONSTRUKTORI
    public Dog(String name, float weight, String favouriteToy) {
        this.name = name;
        this.weight = weight;
        this.favouriteToy = favouriteToy;
    }


    //Metodate qe duhet me i ekpozu per objketet
    public void fetch(String toy) {
        System.out.printf("%s fetched the toy %s%n", name, toy);

    }

    public String getName() {
        return name;
    }

    public void makeFavourite(String toy) {
        favouriteToy = toy;
    }

}









