package lesson2;

public class Main {
    public static void main(String[] args) {
        TeamMember emp1 = new TeamMember("John","765754765");
        emp1.setSalary(10000);
        Task taskOnTime = new Task("taskOnTime", 10);
        taskOnTime.setActualDays(10);

        Task taskBeforeTime = new Task("taskBeforeTime", 20);
        taskBeforeTime.setActualDays(15);

        Task taskAfterTime = new Task("taskAfterTime", 30);
        taskAfterTime.setActualDays(35);

        emp1.addTask(taskOnTime);
        emp1.addTask(taskBeforeTime);

        TeamMember emp2 = new TeamMember("Jack","5875678567");
        emp2.setSalary(30000);
        emp2.addTask(taskOnTime);
        emp2.addTask(taskAfterTime);
        emp2.addTask(taskAfterTime);

        Manager manager = new Manager("Jim","45674567456");
        manager.setSalary(32000);
        manager.addTask(taskOnTime);
        manager.addTeamMember(emp1);
        manager.addTeamMember(emp2);

        int m_bonus = manager.calcBonus();
        System.out.println("manager " + manager.name + " got a bonus of " + m_bonus);
    }
}
