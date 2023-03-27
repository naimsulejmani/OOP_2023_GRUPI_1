package associations_realtionships.todoapp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private static int generateId = 0;
    private final int ID;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt;

    public TodoItem(String title) {
        this.ID = ++generateId;
        this.title = title;
        this.createdAt = LocalDateTime.now();
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // [1] - Porosia Per iftar( 2023-03-27T17:55:10.234) - true
    @Override
    public String toString() {
        return String.format("[%d] - %s (%s): %b",
                ID, title, createdAt, isCompleted());
    }
}











