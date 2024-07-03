// Task.java
public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void complete() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return name + " [" + (isCompleted ? "Completed" : "Not Completed") + "]";
    }
}
