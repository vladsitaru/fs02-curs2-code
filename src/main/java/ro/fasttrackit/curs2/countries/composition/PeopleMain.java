package ro.fasttrackit.curs2.countries.composition;

import java.io.IOException;

public class PeopleMain {
    public static void main(String[] args) throws IOException {
        new PeopleReportGenerator(getCountryProvider())
                .generateReport("output-composition.txt");
    }

    private static PeopleProvider getCountryProvider() {
        return System.currentTimeMillis() % 2 == 0
                ? new InMemoryPeopleProvider()
                : new FilePeopleProvider("src/main/resources/people.txt");
    }
}
