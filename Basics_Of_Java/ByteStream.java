package Basics_Of_Java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.bin")) {
            byte[] data = { 65, 66, 67 };
            fos.write(data);
            System.out.println("Bytes successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("output.bin")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.println("Read bytes: " + (char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


