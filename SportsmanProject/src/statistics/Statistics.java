package statistics;

import interfaces.Scoreable;
import sportsman.enums.Clubs;
import sportsman.sportsman.Footballer;

import java.util.List;

public class Statistics extends Footballer implements Scoreable {
    private List<Integer> goalsPerMatch;
    public Statistics(String name, Clubs club, List<Integer> goalsPerMatch) {
        super(name, club);
        this.goalsPerMatch = goalsPerMatch;
    }
    //in super: am folosit atributele din clasa parinte a Statistics (adica footballer), pentru a lua name si club, iar in Footballer am folosit
    //super pentru a lua name din clasa parinte a Footballer(adica Sportsman)


    public List<Integer> getGoalsPerMatch() {
        return goalsPerMatch;
    }

    public void setGoalsPerMatch(List<Integer> goalsPerMatch) {
        this.goalsPerMatch = goalsPerMatch;
    }

    @Override
    public void totalGoals() {
        int totalGoalsSum = 0;
        for(Integer goal : this.getGoalsPerMatch()) {
            totalGoalsSum += goal;
        }
        System.out.println(this.getName() + " has scored " + totalGoalsSum + " goals.");
    }

}
