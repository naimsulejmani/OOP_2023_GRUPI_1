package interfaces;

import java.time.Period;

public interface Perishable {
    public static final Period MAX_PERIOD = Period.ofDays(7);

    public abstract void perish();

    public abstract boolean isPerished();

    // Java new 8

    public default boolean verifyPeriod(Period p) {
        return comparePeriod(p) < 0;
    }

    private int comparePeriod(Period p) {
        return p.getDays() - MAX_PERIOD.getDays();
    }

    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }


}











