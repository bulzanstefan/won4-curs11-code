package ro.fasttrackit.curs11.files;

import ro.fasttrackit.curs11.homework.Person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws Exception {
        List<Person> persons = readPersons("files/persons.data");
        System.out.println(persons);

        writeReport(persons);
    }

    private static void writeReport(List<Person> persons) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.data"))) {
            for (Person person : persons) {
                writer.write(personToLine(person));
                writer.newLine();
            }
        }
    }

    private static String personToLine(Person person) {
        return person.getName() + " has age " + person.getAge() + " with position " + person.getPosition();
    }

    private static List<Person> readPersons(String filePath) throws Exception {
        List<Person> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //Ana|33|contabil
                result.add(readPersonFromLine(line));
            }
        }
        return result;
    }

    //format: NAME|AGE|POSITION
    private static Person readPersonFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));

        return new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
