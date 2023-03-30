package associations_realtionships.todoapp;

public enum TodoMenu {
    ADD(1, "Shtyp 1 per te shtuar nje Todo!"),
    CHANGE_TITLE(2, "Shtyp 2 per te ndryshuar titullin e nje Todo!"),
    CHANGE_STATUS(3, "Shtyp 3 per te ndryshuar statusin e nje Todo!"),
    DELETE(4, "Shtyp 4 per te fshire nje Todo!"),
    PRINT_ALL(5, "Shtyp 5 per te printuar te gjitha Todo!"),
    PRINT_BY(6, "Shtyp 6 per te printuar sipas keyword-it!"),
    EXIT(7, "Shtyp 7 per EXIT!");
    private int menu;
    private String description;

    TodoMenu(int menu, String description) {
        this.menu = menu;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getMenu() {
        return menu;
    }

    public static void showMenu() {
        System.out.println("--------------------------------");
        for (TodoMenu menu : TodoMenu.values()) {
            System.out.println(menu.getDescription());
        }
        System.out.println("--------------------------------");
    }

    public static TodoMenu findByMenuId(int menu) {
        for (TodoMenu todo : TodoMenu.values()) {
            if (todo.getMenu() == menu)
                return todo;
        }
        return null;
    }
}








