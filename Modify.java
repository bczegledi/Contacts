package contacts_list;

import java.util.Scanner;

public class Modify extends Contact{
    public static void modify() throws InvalidPhoneNumberException {
        Scanner in = new Scanner(System.in);
        Contacts = ReadFromFile.read();
        while (true){
            System.out.print("Munkahelyi/Privát szám: ");
            String inputNumber = in.nextLine();
            if (inputNumber.length() == 0) break;
            else{
                for (Contact i : Contacts){
                    if (i.privatePhoneNumber.equals(inputNumber) || i.workPhoneNumber.equals(inputNumber)){
                        System.out.print("Név: ");
                        String nameIn = in.nextLine();
                        String[] namePcs = nameIn.split(" ");
                        i.lastName = namePcs[0];
                        i.firstName = namePcs[1];
                        System.out.print("Becenév: ");
                        String nicknameIn = in.nextLine();
                        i.nickname = noData.nothing(nicknameIn);
                        System.out.print("Cím: ");
                        String addressIn = in.nextLine();
                        i.address = noData.nothing(addressIn);
                        System.out.print("Munkahelyi szám: ");
                        String workPhoneNumberIn = in.nextLine();
                        i.workPhoneNumber = noData.nothing(workPhoneNumberIn);
                        System.out.print("Privát szám: ");
                        String privateNumberIn = in.nextLine();
                        i.privatePhoneNumber = noData.nothing(privateNumberIn);
                        WriteToFile.write(Contacts);
                    }
                    else {
                        throw new InvalidPhoneNumberException(inputNumber);
                    }
                }
            }
        }
        Menu.mainMenu();
    }
}
