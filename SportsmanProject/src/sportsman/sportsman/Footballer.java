package sportsman.sportsman;

import interfaces.Playable;
import sportsman.enums.Clubs;

import java.io.*;

public class Footballer extends Sportsman implements Playable, Serializable {

    private Clubs club;
    private String position;

    public Footballer(String name, int height, double weight, Clubs club, String position) {
        super(name, height, weight);
        this.club = club;
        this.position = position;
    }

    public Footballer(String name, Clubs club) {
        super(name);
        this.club = club;
    }

    public Clubs getClub() {
        return club;
    }

    public void setClub(Clubs club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName() + " plays at ").append(getClub() + " and he is a ");
        builder.append(getPosition() + ".");
        return builder.toString();
    }

    public void whichPosition() {
        if(this.getHeight() >= 175) {
            System.out.println("His height is good for a position as a defender of an attacker");
            if(this.getWeight() > 60 && this.getWeight() < 75) {
                System.out.println("He is too skinny to be a defender or an attacker according to his weight");
            } else if(this.getWeight() >= 75){
                System.out.println("He is definitely a defender or an attacker according to his height and weight");
            } else {
                System.out.println("Who the fuck is this shadow?");
            }
        } else {
            System.out.println("He is too short, maybe he integrates better as a midfielder.");
        }
    }

    public void serialize() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("object.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Footballer deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("object.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Footballer f = (Footballer)objectInputStream.readObject();
        objectInputStream.close();
        return f;
    }
}
