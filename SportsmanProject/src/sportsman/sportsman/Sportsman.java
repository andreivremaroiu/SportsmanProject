package sportsman.sportsman;

import java.io.Serializable;

public class Sportsman implements Serializable {
    private static final long serialVersionUID = 1L; //trebuie adaugat la o clasa serializabila pentru a verifica ce versiune a clasei am
    //Daca am serializat un obiect cu versiunea 1, dupa care am clasa cu versiunea 2 si vreau sa deserializez obiectul cu versiunea 2
    //Atunci nu voi mai putea sterge obiectul corect
    private String name;
    private int height;
    private double weight;

    public Sportsman(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Sportsman(String name) {
        this.name = name;
    } //acest constructor este pentru a il folosi in Footballer, iar dupa sa folosim in Statistics.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(getName() + "\t");
        builder.append("Height: ").append(getHeight() + "\t");
        builder.append("Weight: ").append(getWeight() + "\t");
        return builder.toString();
    }
}
