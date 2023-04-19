package inheritance.summary;

public class StackTest {
    public static void main(String[] args) {
        WrongStack<Integer> wrongStack = new WrongStack<>();
        wrongStack.push(10);
        wrongStack.push(20);
        System.out.println(wrongStack.pop());

    }
}
