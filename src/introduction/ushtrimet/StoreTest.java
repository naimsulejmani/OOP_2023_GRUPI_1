package introduction.ushtrimet;

import java.time.LocalTime;

public class StoreTest {
    public static void main(String[] args) {

        Store etcFusheKosove = new Store("abc123", "ETC",
                "Fushe Kosove");
        etcFusheKosove.setOpenTime(LocalTime.of(7, 0));
        etcFusheKosove.setCloseTime(LocalTime.of(23, 0));
        System.out.println(etcFusheKosove);
        System.out.println(etcFusheKosove.isOpen());
    }
}








