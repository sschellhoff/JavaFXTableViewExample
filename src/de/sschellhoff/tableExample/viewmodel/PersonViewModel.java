package de.sschellhoff.tableExample.viewmodel;

import de.sschellhoff.tableExample.model.Person;

public class PersonViewModel {
    private final Person model;

    public PersonViewModel(Person model) {
        this.model = model;
    }

    public String getName() {
        return model.getName();
    }

    public String getSurname() {
        return model.getSurname();
    }

    public Integer getAge() {
        return model.getAge();
    }
}
