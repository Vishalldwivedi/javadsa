import java.util.ArrayList;
import java.util.Scanner; class
StringListOperations {
    private ArrayList<String> stringList;
    public StringListOperations() {
    stringList = new ArrayList<>();
}
    public void insertItem(String item) {
        stringList.add(item);
        System.out.println("Inserted successfully");
    }
    public void searchItem(String item) {
        if (stringList.contains(item)) {
            System.out.println("Item found in the list.");
        } else {
            System.out.println("Item not found in the list.");
        }
    }
    public void deleteItem(String item) {
        if (stringList.contains(item)) {
            stringList.remove(item);
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Item does not exist.");
        }
    }
    public void displayItems() {
        System.out.println("The Items in the list are :");
        for (String item : stringList) {
            System.out.println(item);
        }
    }
} public class exp6th

{
    public static void main(String[] args) {
        StringListOperations slist = new StringListOperations(); Scanner scanner
                = new Scanner(System.in); while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) { case 1:
                System.out.println("Enter the item to be inserted:");
                String itemToInsert = scanner.nextLine();
                slist.insertItem(itemToInsert); break;
                case
                    2:
                System.out.println("Enter the item to search:");
                String itemToSearch = scanner.nextLine();
                slist.searchItem(itemToSearch); break;
                case 3:
                    System.out.println("Enter the item to delete:");
                    String itemToDelete = scanner.nextLine();
                    slist.deleteItem(itemToDelete); break;
                case 4: slist.displayItems(); break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close(); System.exit(0);
                    break; default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}