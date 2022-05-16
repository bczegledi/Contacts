package contacts_list;

import java.io.*;
import java.util.ArrayList;

public class WriteToFile implements Serializable {
    public static void write(ArrayList<Contact> list) {
        try{
            FileWriter fw = new FileWriter("contacts.txt");
            PrintWriter pw = new PrintWriter(fw);
            for(Contact i : list){
                pw.println(i.toString());
            }
            pw.close();
        }
        catch (IOException e){
            System.out.println("Írási hiba történt!");
        }
    }
}
