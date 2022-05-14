package ro.fasttrackit.curs2.countries.composition;

import ro.fasttrackit.curs2.countries.People;

import java.util.List;

public interface PeopleProvider {
    List<People> readPeople();
}
