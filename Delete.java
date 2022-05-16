package contacts_list;

import java.util.Scanner;

public class Delete extends Contact{
    public static void delete() throws InvalidPhoneNumberException {
        Scanner in = new Scanner(System.in);
        Contacts = ReadFromFile.read();
        while (true){
            System.out.print("Munkahelyi/Privát szám: ");
            String inputNumber = in.nextLine();
            if (inputNumber.length() == 0) break;
            for(int i = 0; i < Contacts.size(); i++){
                if (Contacts.get(i).privatePhoneNumber.equals(inputNumber) || Contacts.get(i).workPhoneNumber.equals(inputNumber)){
                    Contacts.remove(i);
                    System.out.println("Névjegy törölve!");
                }
                else{
                    throw new InvalidPhoneNumberException(inputNumber);
                }
            }
        }
        WriteToFile.write(Contacts);
        Menu.mainMenu();
    }
}
