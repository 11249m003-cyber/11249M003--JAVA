import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Comparison
        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Employee names are same");
        else
            System.out.println("Employee names are different");

        // Book Array
        String books[] = new String[10];

        System.out.println("\nEnter 10 book titles:");
        for (int i = 0; i < 10; i++) {
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with A:");
        for (int i = 0; i < 10; i++) {
            if (books[i].startsWith("A"))
                System.out.println(books[i]);
        }

        sc.close();
    }
}