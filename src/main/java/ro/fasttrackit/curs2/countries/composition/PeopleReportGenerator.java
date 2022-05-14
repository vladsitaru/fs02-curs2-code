package ro.fasttrackit.curs2.countries.composition;

import lombok.RequiredArgsConstructor;
import ro.fasttrackit.curs2.countries.People;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class PeopleReportGenerator {
    private final PeopleProvider peopleProvider;

    public void generateReport(String outputFile) throws IOException {
        List<People> peopleList = peopleProvider.readPeople();
        generateReport(peopleList, outputFile);
    }

    private void generateReport(List<People> peopleList, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("--- Ages: 1-30 --- \n");
            peopleList.stream()
                    .filter(people -> people.age() <= 30)
                    .map(people -> people.name() + " : " + people.age())
                    .forEach(line -> writeLine(writer, line));
            writer.write("\n--- Ages: 30-50 ---\n");
            peopleList.stream()
                    .filter(people -> people.age() >= 30 && people.age() <= 50)
                    .map(people -> people.name() + " : " + people.age())
                    .forEach(line -> writeLine(writer, line));
            writer.write("\n--- Ages: 50+ ---\n");
            peopleList.stream()
                    .filter(people -> people.age() >= 50)
                    .map(people -> people.name() + " : " + people.age())
                    .forEach(line -> writeLine(writer, line));
        }
    }

    private void writeLine(BufferedWriter writer, String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}