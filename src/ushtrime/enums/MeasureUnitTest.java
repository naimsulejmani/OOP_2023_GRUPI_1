package ushtrime.enums;

import java.util.EnumSet;

public class MeasureUnitTest {
    public static void main(String[] args) {
        MeasureUnit usb = MeasureUnit.KILO_BYTE;

        for (MeasureUnit m : MeasureUnit.values()) {
            System.out.println(m);
        }

        for (MeasureUnit m : EnumSet.range(MeasureUnit.BIT, MeasureUnit.TERA_BIT)) {
            System.out.println(m);
        }
    }
}



