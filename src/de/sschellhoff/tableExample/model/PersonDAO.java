package de.sschellhoff.tableExample.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonDAO {
    private final String path;

    public PersonDAO() {
        this.path = "data/persons.csv";
    }

    public List<Person> getPersons() {
        List<Person> result = new ArrayList<Person>();
        try(Stream<String> stream = Files.lines(Paths.get(this.path))) {
            stream.forEach(line -> result.add(Person.GetFromCVSLine(line)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
