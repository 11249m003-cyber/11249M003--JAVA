
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessApp {
    public static void main(String[] args) {
        String fileName = "profile.txt";

        String profile = "User Name: Arsiya\n"
                       + "Age: 21\n"
                       + "Weight: 55 kg\n"
                       + "Height: 160 cm\n";

        try {
            FileOutputStream fout = new FileOutputStream(fileName);

            fout.write(profile.getBytes());

            fout.close();
            System.out.println("Profile data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try {
            FileInputStream fin = new FileInputStream(fileName);

            int ch;
            System.out.println("\nUser Profile:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}