package ro.fasttrackit.curs2.countries.composition;

import ro.fasttrackit.curs2.countries.People;

import java.util.List;

public class InMemoryPeopleProvider implements PeopleProvider {
    @Override
    public List<People> readPeople() {
        return List.of(
                new People("Adam", 25),
                new People("Chris", 34),
                new People("Paul", 52),
                new People("Matthew", 47),
                new People("George", 62)
        );
    }
}
