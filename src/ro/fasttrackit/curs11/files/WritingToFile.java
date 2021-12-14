package ro.fasttrackit.curs11.files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingToFile {
    public static void main(String[] args) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))) {
            writer.write("This is my first output file");
            writer.write("This is my first output file");
            writer.write("This is my first output file");
            writer.write("This is my first output file");
            //
            // throw NPE
            //
        }
    }
}
