package interfaces;

public class MyListener implements KeyListener {
    @Override
    public void keyPressed(Object keyEvent) {
        System.out.println(" U shtyp nje tast");
    }

    @Override
    public void keyReleased(Object keyEvent) {
        System.out.println("U lirua nje tast nga shtypja");
    }

    @Override
    public void keyTyped(Object keyEvent) {
        System.out.println("Po e shtypi nje tast");
    }
}
