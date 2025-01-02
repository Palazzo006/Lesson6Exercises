import java.io.File;

public class FileStatistics2 {
    public static void main(String[] args) {
        File quoteTxt = new File("Quote.txt");
        File quoteDoc = new File("Quote.docx");

        long sizeTxt = quoteTxt.length();
        long sizeDoc = quoteDoc.length();
        double ratio = (sizeDoc != 0) ? (double) sizeTxt / sizeDoc : 0;

        System.out.println("Size of Quote.txt: " + sizeTxt + " bytes");
        System.out.println("Size of Quote.docx: " + sizeDoc + " bytes");
        System.out.printf("Ratio of sizes (txt/docx): %.4f\n", ratio);
    }
}
