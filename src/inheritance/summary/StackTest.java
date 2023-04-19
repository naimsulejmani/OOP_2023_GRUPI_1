package inheritance.summary;

public class StackTest {
    public static void main(String[] args) {
        WrongStack<Integer> wrongStack = new WrongStack<>();
        wrongStack.push(10);
        wrongStack.push(20);
        System.out.println(wrongStack.pop());
        wrongStack.add(23);


        Stack<Integer> goodStack = new Stack<>();
        goodStack.push(10);
        goodStack.push(20);
        System.out.println(goodStack.peek());
        System.out.println(goodStack.pop());

    }
}








