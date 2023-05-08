package interfaces;

public interface KeyListener {
    void keyPressed(Object keyEvent);

    void keyReleased(Object keyEvent); // keyUp

    void keyTyped(Object keyEvent); // keyDown
}
