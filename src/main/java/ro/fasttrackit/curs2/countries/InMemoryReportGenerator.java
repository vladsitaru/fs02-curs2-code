package ro.fasttrackit.curs2.countries;

import java.util.List;

public class InMemoryReportGenerator extends PeopleReportGenerator {
    @Override
    List<People> readPeople() {
        return List.of(
                new People("Adam", 25),
                new People("Chris", 34),
                new People("Paul", 52),
                new People("Matthew", 47),
                new People("George", 62)

        );
    }

}
