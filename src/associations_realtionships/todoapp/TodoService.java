package associations_realtionships.todoapp;

import java.util.ArrayList;

public class TodoService {
    private static ArrayList<TodoItem> items = new ArrayList<>();

    public static void add(String title) {
        TodoItem newTodo = new TodoItem(title);
        items.add(newTodo);
    }

    public static void printAll() {
        System.out.println("Total items: " + items.size());
        System.out.println("-----------------------------");
        for (TodoItem item : items) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
    }


    public static TodoItem findBy(int todoId) {
        for (int i = 0; i < items.size(); i++) {
            TodoItem item = items.get(i);
            if (item.getID() == todoId) {
                return item;
            }
        }
        return null;
    }
    public static void changeStatus(int todoId) {
        TodoItem item = findBy(todoId);
        if (item == null) {
            System.out.println("Elementi me ID nuk gjendet!");
            return;
        }
        item.setCompleted(!item.isCompleted());
    }
    public static void deleteBy(int todoId) {
        TodoItem item = findBy(todoId);
        if (item == null) {
            System.out.println("Elementi me ID nuk gjendet!");
            return;
        }
        items.remove(item);
    }
}





















