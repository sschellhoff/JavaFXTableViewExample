package de.sschellhoff.tableExample.viewmodel;

import de.sschellhoff.tableExample.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class PersonTableViewModel {
    private ObservableList<PersonViewModel> items;

    public PersonTableViewModel() {
        this.items = FXCollections.observableArrayList();
        this.items.add(new PersonViewModel(new Person("Peter", "Trompeter", 1337)));
        this.items.add(new PersonViewModel(new Person("Hans", "Meiser", 42)));
    }

    public ObservableList<PersonViewModel> getItems() {
        return items;
    }
}
