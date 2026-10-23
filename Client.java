
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataInputStream in =
                new DataInputStream(s.getInputStream());
            DataOutputStream out =
                new DataOutputStream(s.getOutputStream());

            out.writeUTF("Hello from Client!");

            String reply = in.readUTF();
            System.out.println("Server says: " + reply);

            in.close();
            out.close();
            s.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}