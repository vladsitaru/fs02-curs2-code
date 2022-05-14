package ro.fasttrackit.curs2.countries;

import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RequiredArgsConstructor
public class FileReportGenerator extends PeopleReportGenerator {
    private final String sourceFile;

    @Override
    List<People> readPeople() {
        try {
            return Files.lines(Path.of(sourceFile))
                    .map(this::peopleList)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private People peopleList(String line) {
        String[] tokens = line.split(",");
        return new People(tokens[0], Integer.valueOf(tokens[2]));
    }
}
