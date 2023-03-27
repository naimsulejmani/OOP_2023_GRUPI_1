package associations_realtionships.todoapp;

public class TodoApp {
    public static void main(String[] args) throws InterruptedException {
        TodoService.add("Porosia per iftar");
        Thread.sleep(100);
        TodoService.add("Beje iftarin");
        Thread.sleep(200);
        TodoService.add("Dhezne cigaren!!!");

        TodoService.printAll();

        System.out.println("   TEST    ");

        TodoService.changeStatus(1);
        TodoService.changeStatus(3);
        TodoService.deleteBy(5);
        TodoService.deleteBy(2);
        TodoService.printAll();

    }
}











