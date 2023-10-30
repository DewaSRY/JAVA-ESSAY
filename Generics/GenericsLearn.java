package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsLearn {
    
    public static void scoreResult(BaseBallTeam team1, int t1_Score ,BaseBallTeam team2, int t2_Score ){
        String massage = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t1_Score, t2_Score);
        System.out.printf("%s %s %s %n", team1, massage, team2);

    }
}

class BaseBallTeam {
    private String teamName;
    private List<BaseBallPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLooses = 0;
    private int totalTies = 0;
    
    public BaseBallTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseBallPlayer player) {
        if (!this.teamMembers.contains(player)) {
            this.teamMembers.add(player);
        }
    }
    public void listTeamMembers() {
        System.out.println(this.teamName + " Roster: ");
        System.out.println(this.teamMembers);
    }

    public int ranking() {
        return (this.totalLooses * 2) + this.totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String massage = "Lost to ";
        if (ourScore > theirScore) {
            this.totalWins++;
            massage = "Beat ";

        } else if (ourScore == theirScore) {
            this.totalTies++;
            massage = "tied ";
        } else {
            this.totalLooses++;
        }
        return massage;
    }

    public String toString() {
        return this.teamName + "(Ranked " + this.ranking() +" )" + "wins: " + this.totalWins + " game" ;
    }
}

record BaseBallPlayer(String name, String position) {}

class team<T> {
    
}