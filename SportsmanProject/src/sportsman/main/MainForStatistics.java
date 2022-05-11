package sportsman.main;

import com.sun.security.jgss.GSSUtil;
import sportsman.enums.Clubs;
import statistics.Statistics;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MainForStatistics {
    public static void main(String[] args) {
        List<Integer> goalsForS1 = Arrays.asList(2, 3, 4, 5, 5);
        Statistics s1 = new Statistics("Vrema" , Clubs.Flacara, goalsForS1);

        Statistics stats;

        long count = goalsForS1.stream().count();
        System.out.println("Nr elemente din lista: " + count);
        System.out.println("-------------------");
        List<Integer> newListDistinct = goalsForS1.stream().distinct().collect(Collectors.toList());
        for(int element : newListDistinct) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        List<String> differentNames = Arrays.asList("Ronaldo", "Messi", "Ibrahimovic", "Ronaldinho", "Icardi", "Mesut");
        String playersWithMoreThan8Letters = differentNames.stream().filter(s -> s.length() > 8).collect(Collectors.joining(", "));
        System.out.println(playersWithMoreThan8Letters);
        System.out.println("-------------------");
        String playersWithM = differentNames.stream().filter(s -> s.startsWith("M")).collect(Collectors.joining(", "));
        String playersWithI = differentNames.stream().filter(s -> s.startsWith("I")).collect(Collectors.joining(", "));
        String playersWithR = differentNames.stream().filter(s -> s.startsWith("R")).collect(Collectors.joining(", "));
        System.out.println("Players with R:\n " + playersWithR);
        System.out.println("Players with I:\n " + playersWithI);
        System.out.println("Players with M: \n" + playersWithM);






        //s1.totalGoals();
    }
}
