package lesson2;
import java.util.*;

public class Employee {
    protected String name;
    protected String id;
    protected List<Task> tasks;
    protected int salary;
    protected int bonus;

    public Employee(String name, String id) {
        this.name = new String(name);
        this.id = new String(id);
        this.tasks = new LinkedList<Task>();
        this.salary = 0;
        this.bonus = 0;
    }

    public int getSalary() {
        return salary;
    }
    public int getBonus() {
        return bonus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void addTask(Task task) {
        tasks.add(new Task(task));
    }

    public int calcBonus() {
        return 0; // temporary
    }
}
