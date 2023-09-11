package tableOfContents;

import java.util.Scanner;

public class TableOfContentsUI {
    public static void main(String[] args) {
        TableOfContents tableOfContents = new TableOfContents();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Überschrift ein:");
        String heading = scanner.nextLine();
        System.out.println("Bitte geben Sie die Seitenzahl ein:");
        String page = scanner.nextLine();
        System.out.println(tableOfContents.createEntry(heading, page));
    }
}
