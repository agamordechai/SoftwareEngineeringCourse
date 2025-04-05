package lesson2;

public class Task {
    private String name;
    private int deadLineDays;
    private int actualDays;

    public Task(String name, int deadLineDays) {
        this.name = name;
        this.deadLineDays = deadLineDays;
    }
    public Task(Task task) {
        this.name = task.name;
        this.deadLineDays = task.deadLineDays;
        this.actualDays = task.actualDays;
    }

    public String getName() {
        return name;
    }
    public int getDeadLineDays() {
        return deadLineDays;
    }
    public int getActualDays() {
        return actualDays;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDeadLineDays(int deadLineDays) {
        this.deadLineDays = deadLineDays;
    }
    public void setActualDays(int actualDays) {
        this.actualDays = actualDays;
    }

    public int isOnTime() {
        if (actualDays > deadLineDays) {
            return -1;
        }
        else if (actualDays < deadLineDays) {
            return 1;
        }
        return 0;
    }
}
