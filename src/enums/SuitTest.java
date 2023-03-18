package enums;

public class SuitTest {
    public static void drawSuitOnCard(int suit) {

    }

    public static void drawSuitOnCard(Suit suit) {

    }

    public static void main(String[] args) {
        drawSuitOnCard(-10);
        drawSuitOnCard(1000);
        drawSuitOnCard(0);
        drawSuitOnCard(1);
        drawSuitOnCard(Suit.CLUBS);
        drawSuitOnCard(Suit.HEARTS);

        String tipi = "CLUBS";
        Suit suit = Suit.valueOf(tipi);
        System.out.println(suit);

        String tipi1 = "hearts";
        suit = Suit.valueOf(tipi1.toUpperCase());
        System.out.println(suit);




    }
}








