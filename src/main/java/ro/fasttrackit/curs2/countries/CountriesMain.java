package ro.fasttrackit.curs2.countries;

import java.io.IOException;

public class CountriesMain {
    public static void main(String[] args) throws IOException {
//        var generator = new InMemoryReportGenerator();
        var generator = new FileReportGenerator("src/main/resources/countries.txt");
        generator.generateReport("output.txt");
    }
}
