package de.sschellhoff.tableExample.viewmodel;

import de.sschellhoff.tableExample.model.Person;
import de.sschellhoff.tableExample.model.PersonDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;


public class PersonTableViewModel {
    private ObservableList<PersonViewModel> items;

    public PersonTableViewModel() {
        this.items = FXCollections.observableArrayList();
        PersonDAO personDao = new PersonDAO();
        List<Person> personModels = personDao.getPersons();
        personModels.forEach(person -> items.add(new PersonViewModel(person)));
    }

    public ObservableList<PersonViewModel> getItems() {
        return items;
    }
}
