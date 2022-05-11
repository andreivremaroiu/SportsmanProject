package sportsman.main;

import sportsman.enums.Clubs;
import sportsman.sportsman.Footballer;
import sportsman.sportsman.Sportsman;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Footballer f1 = new Footballer("Babarica", 180, 70, Clubs.Chindia, "forward");
        Footballer f2 = new Footballer("Vrema", 180, 80, Clubs.Flacara, "defender");
        Footballer f3 = new Footballer("Strujy", 185, 90, Clubs.Ceahlaul, "goalkeeper");
        Footballer f4 = new Footballer("Lipan", 190, 90, Clubs.Steaua, "forward");
        Footballer f5 = new Footballer("Iulica", 170, 63, Clubs.Rapid, "midfielder");

        List<Footballer> footballers = new ArrayList<>();
        footballers.add(f1);
        footballers.add(f2);
        footballers.add(f3);
        footballers.add(f4);
        footballers.add(f5);

        for(Footballer footballer : footballers) {
            System.out.println(footballer.getName() + ": ");
            footballer.whichPosition();
        }
    }
}
