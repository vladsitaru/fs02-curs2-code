package ro.fasttrackit.curs2.countries.composition;

import lombok.RequiredArgsConstructor;
import ro.fasttrackit.curs2.countries.People;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RequiredArgsConstructor
public class FilePeopleProvider implements PeopleProvider {
    private final String sourceFile;

    @Override
    public List<People> readPeople() {
        try {
            return Files.lines(Path.of(sourceFile))
                    .map(this::toPeople)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private People toPeople(String line) {
        String[] tokens = line.split(",");
        return new People(tokens[0], Integer.valueOf(tokens[2]));
    }

}
