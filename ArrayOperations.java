import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales[] = new int[12];
        System.out.println("Enter monthly sales for 12 months:");
        for (int i = 0; i < 12; i++) {
            sales[i] = sc.nextInt();
        }
        int max = sales[0];
        int min = sales[0];
        for (int i = 1; i < 12; i++) {
            if (sales[i] > max)
                max = sales[i];
            if (sales[i] < min)
                min = sales[i];
        }
        System.out.println("Highest Sales: " + max);
        System.out.println("Lowest Sales: " + min);
        int rating[] = new int[5];
        int sum = 0;
        System.out.println("\nEnter 5 feedback ratings:");
        for (int i = 0; i < 5; i++) {
            rating[i] = sc.nextInt();
            sum += rating[i];
        }
        double average = sum / 5.0;
        System.out.println("Average Rating: " + average);
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
    }
}