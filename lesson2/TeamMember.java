package lesson2;

public class TeamMember extends Employee {

    public TeamMember(String name, String id) {
        super(name, id);
    }

    public int calcBonus() {
        int factor = salary/tasks.size();
        int bonus = 0;
        for (Task task: tasks) {
            if (task.isOnTime() == 1) {
                bonus += factor*2;
            }
            else if (task.isOnTime() == 0) {
                bonus += factor;
            }
        }
        return bonus;
    }
}
