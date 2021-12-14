package ro.fasttrackit.curs11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws Exception {
        readOneLine();
        readFullFile();
        readFileBuffered();
    }

    private static void readFileBuffered() throws Exception {
        System.out.println("Buffered read:");
        BufferedReader filerReader = new BufferedReader(new FileReader("files/content.txt"));

        String line;
        while ((line = filerReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void readFullFile() throws Exception {
        System.out.println("----- All file: ");
        Scanner fileScanner = new Scanner(new File("files", "content.txt"));
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
//            System.out.println(fileScanner.next());
//            System.out.println(fileScanner.nextInt());
        }
    }


    private static void readOneLine() throws Exception {
        Scanner fileScanner = new Scanner(new File("files", "content.txt"));
        String line = fileScanner.nextLine();
        System.out.println(line);
    }
}
