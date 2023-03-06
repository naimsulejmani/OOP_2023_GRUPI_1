package introduction;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "Electric";
        pikachu.health = 70;

        pikachu.attack();

        Pokemon profesori = new Pokemon();
        profesori.name = "OOP";
        profesori.type = "provim";
        profesori.health = 100;

        profesori.attack();
    }
}






