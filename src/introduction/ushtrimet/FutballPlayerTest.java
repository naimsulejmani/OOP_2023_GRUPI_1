package introduction.ushtrimet;

import java.time.LocalDate;

public class FutballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer benzema = new FootballPlayer("Karim","Benzema",
                "2000-01-01","Real Madrid");
        System.out.println(benzema);

        FootballPlayer mbappe = new FootballPlayer((byte)10,"Kylian", "Mbappe",
                "France", LocalDate.of(2002,3,3),"FW",
                true,"PSG",1.9f,80f,'R',(byte) 94);
        System.out.println(mbappe);

        FootballPlayer messi = new FootballPlayer((byte)30,"Lionel","Messi");

        System.out.println(messi);
    }
}
