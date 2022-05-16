package contacts_list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ReadFromFile implements Serializable {
    public static ArrayList<Contact> read(){
        ArrayList<Contact> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader("contacts.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] pieces = line.split("\t");
                String[] namePieces = pieces[0].split(" ");
                Contact c = new Contact(namePieces[0], namePieces[1], pieces[1], pieces[2], pieces[3], pieces[4]);
                list.add(c);
            }
        }
        catch (IOException e){
            System.out.println("Olvasási hiba történt.");
        }
        return list;
    }
}
