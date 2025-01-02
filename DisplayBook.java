import java.io.*;
import java.util.Scanner;

public class DisplayBook {
    public static void main(String[] args) {
        String filename = "favorite_book.txt";
        File bookFile = new File(filename);
        Scanner scanner = new Scanner(System.in);

        if (bookFile.exists()) {
            try (FileInputStream fis = new FileInputStream(bookFile)) {
                byte[] data = new byte[(int) bookFile.length()];
                fis.read(data);
                String bookTitle = new String(data, "UTF-8").trim();
                System.out.println("Your favorite book is: " + bookTitle);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.print("File does not exist. Enter your favorite book title: ");
            String bookTitle = scanner.nextLine();
            try (FileOutputStream fos = new FileOutputStream(bookFile)) {
                fos.write(bookTitle.getBytes());
                System.out.println("Book title saved to file: " + filename);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }
}
