
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {
        String fileName = "editor.txt";
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Welcome to the Text Editor!\n");
            fw.write("This is my Java file handling program.");
            fw.close();

            System.out.println("Content written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            System.out.println("\nFile Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}