import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class FileStatistics {
    public static void main(String[] args) {
        Path filePath = Paths.get("Exercise1.txt"); 

        try {
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("----------------");
            System.out.println("File Information");
            System.out.println("----------------");
            System.out.println("Name: " + filePath.getFileName());
            System.out.println("Size: " + attr.size() + " bytes");
            System.out.println("Last Modified Time: " + attr.lastModifiedTime());
        } catch (IOException e) {
            System.err.println("Error reading file attributes: " + e.getMessage());
        }
    }
}
