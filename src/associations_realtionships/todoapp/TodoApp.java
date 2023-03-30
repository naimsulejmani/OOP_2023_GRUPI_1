package associations_realtionships.todoapp;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) throws InterruptedException {

        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjidh menu: ");
        TodoMenu.showMenu();
        int menu = Integer.parseInt(reader.nextLine());
        TodoMenu todoMenu = TodoMenu.findByMenuId(menu);

        while (todoMenu != TodoMenu.EXIT) {
            if (todoMenu != null) {
                switch (todoMenu) {
                    case ADD -> addNewTodo(reader);
                    case CHANGE_TITLE -> changeTitle(reader);
                    case CHANGE_STATUS -> changeStatus(reader);
                    case DELETE -> deleteTodo(reader);
                    case PRINT_ALL -> printAllTodos();
                    case PRINT_BY -> printAllTodosBy(reader);
                }
            } else {
                System.out.println("Nuk keni zgjedhur menu valide!");
            }
            System.out.println("Zgjidh nje menu: ");
            TodoMenu.showMenu();
            menu = Integer.parseInt(reader.nextLine());
            todoMenu = TodoMenu.findByMenuId(menu);
        }
    }

    private static void printAllTodosBy(Scanner reader) {
        System.out.println("Shkruani tekstin e filtrimit: ");
        String filterText = reader.nextLine();
        TodoService.printTodosThatContains(filterText);
    }

    private static void printAllTodos() {
        TodoService.printAll();
    }

    private static void deleteTodo(Scanner reader) {
        System.out.println("Zgjidh njeren nga lista e meposhtme: ");
        printAllTodos();
        int todoId = Integer.parseInt(reader.nextLine());
        TodoService.deleteBy(todoId);
    }

    private static void changeStatus(Scanner reader) {
        System.out.println("Zgjidh njeren nga lista e meposhtme: ");
        printAllTodos();
        int todoId = Integer.parseInt(reader.nextLine());
        TodoService.changeStatus(todoId);
    }
    private static void changeTitle(Scanner reader) {
        System.out.println("Zgjidh njeren nga lista e meposhtme: ");
        printAllTodos();
        int todoId = Integer.parseInt(reader.nextLine());
        System.out.println("Shkruaj titullin e ri: ");
        String newTitle = reader.nextLine();
        TodoService.changeTitle(todoId, newTitle);
    }

    private static void addNewTodo(Scanner reader) {
        System.out.println("Shkruani titullin e todos: ");
        String title = reader.nextLine();
        TodoService.add(title);
    }
}











