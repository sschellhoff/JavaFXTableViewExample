package de.sschellhoff.tableExample.view;

import de.sschellhoff.tableExample.viewmodel.PersonTableViewModel;
import de.sschellhoff.tableExample.viewmodel.PersonViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class MainView {
    @FXML
    private TableView<PersonViewModel> personTable;

    private PersonTableViewModel viewModel = new PersonTableViewModel();

    public void initialize() {
        personTable.setItems(viewModel.getItems());
    }
}
