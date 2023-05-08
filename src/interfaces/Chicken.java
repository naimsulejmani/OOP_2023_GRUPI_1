package interfaces;

import java.time.Period;

public class Chicken implements Perishable{
    @Override
    public void perish() {

    }

    @Override
    public boolean isPerished() {
        return !verifyPeriod(Period.ofDays(20));
    }
}
