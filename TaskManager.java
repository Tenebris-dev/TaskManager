// TaskManager.java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
        }
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Buy groceries"));
        manager.addTask(new Task("Finish project"));
        manager.addTask(new Task("Read book"));

        System.out.println("All Tasks:");
        manager.listTasks();

        System.out.println("\nCompleting the first task...");
        manager.completeTask(0);

        System.out.println("\nAll Tasks:");
        manager.listTasks();
    }
}