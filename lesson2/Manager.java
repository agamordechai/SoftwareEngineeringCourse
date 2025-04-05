package lesson2;
import java.util.*;

public class Manager extends Employee {
    private List<TeamMember> teamMembers;

    public Manager(String name, String id) {
        super(name, id);
        this.teamMembers = new LinkedList<TeamMember>();
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    public int calcBonus() {
        int factor1 = salary/10;
        int bonus = 0;
        bonus += factor1*tasks.size();

        int factor2 = salary/teamMembers.size();
        for (TeamMember teamMember: teamMembers) {
            if (teamMember.calcBonus() >= teamMember.salary) {
                bonus += factor2;
            }
        }
        return bonus;
    }
}
