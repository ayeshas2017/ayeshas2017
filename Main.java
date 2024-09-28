import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person owner = new Person("Ayesha Kamran ", "123-456-7890");
        Address address = new Address("PGHS-1", "Lahore ", "00000");
        PharmacyShop shop = new PharmacyShop(owner, address);


        boolean running = true;
        while (running) {
            System.out.println("\n=== Pharmacy Inventory System ===");
            System.out.println("1. Add Medicine");
            System.out.println("2. Update Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Sell Medicine");
            System.out.println("5. Display All Medicines");
            System.out.println("6. Search Medicine");
            System.out.println("7. Print Total Revenue");
            System.out.println("8. Display Expired Medicines");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            // Add your switch case logic here to handle the choice

            if (choice == 9) {
                running = false;
                System.out.println("Exiting...");
            }
        }
        sc.close(); 
    }
}
