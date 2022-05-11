package sportsman.main;

import sportsman.enums.Clubs;
import sportsman.sportsman.Footballer;

import javax.xml.crypto.Data;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewMainForWriting {
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

        //Scriere in fisier text
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("footballer.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);

            for(Footballer f : footballers) {
                writer.write(f.getName() + " ");
                writer.write(f.getClub() + " ");
                writer.write(f.getPosition() + " ");
                Integer height = f.getHeight();
                double weight = f.getWeight();
                writer.write("height = " + height + " and weight = " + weight);
                writer.write(System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Citire din fisier text: ");
        ArrayList<String> listOfFootballers = new ArrayList<>();
        //Citire din fisier text
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Legion\\IdeaProjects\\SportsmanProject\\footballer.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String lineOfFootballer = reader.readLine();
            while(lineOfFootballer != null) {
                listOfFootballers.add(lineOfFootballer);
                System.out.println(lineOfFootballer);
                lineOfFootballer = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Scriere in fisier binar
//        try {
//            FileOutputStream binaryOutputStream = new FileOutputStream("footballers.bin");
//            DataOutputStream dataOutputStream = new DataOutputStream(binaryOutputStream);
//            for(Footballer f : footballers) {
//                dataOutputStream.writeUTF(f.getName() + " ");
//                dataOutputStream.writeUTF(f.getClub() + " ");
//                dataOutputStream.writeUTF(f.getPosition() + " ");
//                dataOutputStream.writeInt(f.getHeight());
//                dataOutputStream.writeUTF(" ");
//                dataOutputStream.writeDouble(f.getWeight());
//                dataOutputStream.writeUTF("\n");
//            }
//            dataOutputStream.close();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

        //System.out.println("Citire din fisier binar:");
        //ArrayList<String> binaryFootballers = new ArrayList<>();
        //Citire din fisier binar
//        try (FileInputStream binaryInputStream = new FileInputStream("footballers.bin");
//             DataInputStream dataInputStream = new DataInputStream(binaryInputStream)){
//            String lineOfBinaryFootballer = dataInputStream.readUTF();
//            while (lineOfBinaryFootballer != null) {
//                String name = dataInputStream.readUTF();
//                String team = dataInputStream.readUTF();
//                String position = dataInputStream.readUTF();
//                int height = dataInputStream.readInt();
//                double weight = dataInputStream.readDouble();
//                binaryFootballers.add(name + " " + team + " " + position + " " + height + " " + weight);
//                lineOfBinaryFootballer = dataInputStream.readUTF();
//            }
//            dataInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //Nu mi-a mers citirea tuturor fisierelor din binar, asa ca o sa intreb candva la curs

        //Voi face serializarea clasei Footballer -> pt asta, trebuie sa fie serializabila
//        for(Footballer f : footballers) {
//            f.serialize();
//        }
//
//        try {
//            Footballer f = Footballer.deserialize();
//            System.out.println(f);
//        } catch (ClassNotFoundException | IOException e) {
//            e.printStackTrace();
//        }


    }
}
