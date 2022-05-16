package contacts_list;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Menu.mainMenu();

        while (true){
            try {
                Integer input = Integer.parseInt(in.nextLine());

                if(input == 6){
                    Menu.exit();
                    break;
                }
                else if (input == 1){
                    New.newContact();
                }
                else if (input == 2){
                    Modify.modify();
                }
                else if (input == 3){
                    Delete.delete();
                }
                else if (input == 4){
                    List.list();
                }
                else if (input == 5){
                    Search.search();
                }
            }
            catch (NumberFormatException n){
                System.out.println("Helytelen beviteli formátum! Elfogadott: [1-6]");
                Menu.mainMenu();
            } catch (Exception e){
                System.out.println(e.getMessage());
                Menu.mainMenu();
            }

        }

    }
}
