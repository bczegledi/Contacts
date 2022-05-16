package contacts_list;

public class Menu {

    public static void mainMenu(){
        System.out.println("Válasszon az alábbiak közül!");
        System.out.println("[1] Új névjegy felvétele");
        System.out.println("[2] Névjegy adatainak módosítása");
        System.out.println("[3] Névjegy törlése");
        System.out.println("[4] Listázás");
        System.out.println("[5] Keresés");
        System.out.println("[6] Kilépés");
        System.out.print("Választás: ");
    }

    public static  void listMenu(){
        System.out.println("Mi szerint szeretne listázni?");
        System.out.println("[1] Név");
        System.out.println("[2] Becenév");
        System.out.println("[3] Rendezés nélkül");
        System.out.print("Választás: ");
    }

    public static void searchMenu(){
        System.out.println("Mi szerint szeretne keresni?");
        System.out.println("[1] Név");
        System.out.println("[2] Becenév");
        System.out.println("[3] Cím");
        System.out.println("[4] Telefonszám");
        System.out.print("Választás: ");
    }

    public static void exit(){
        System.out.println("Viszontlátásra!");
    }
}
