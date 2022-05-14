package ro.fasttrackit.curs2.countries;

import java.io.IOException;

public class PeopleMain {
    public static void main(String[] args) throws IOException {
//        var generator = new InMemoryReportGenerator();
        var generator = new FileReportGenerator("src/main/resources/people.txt");
        generator.generateReport("output.txt");
    }
}
