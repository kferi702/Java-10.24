package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TableView<Szemely> tabla;

	@FXML
	private TableColumn<Szemely, String> tablaID;

	@FXML
	private TableColumn<Szemely, String> tablaVnev;

	@FXML
	private TableColumn<Szemely, String> tablaKnev;

	@FXML
	private TableColumn<Szemely, String> tablaSzD;
	@FXML
	private TextField idMezo;

	@FXML
	private TextField vNevMezo;

	@FXML
	private TextField kNevMezo;

	@FXML
	private TextField szdMezo;

	private ObservableList<Szemely> tablaAdatok = FXCollections.observableArrayList();

	@FXML
	void MenuItemKilepes(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void hozzadGomb(ActionEvent event) {
		Szemely sz = new Szemely(idMezo.getText(), 
								vNevMezo.getText(), 
								kNevMezo.getText(), 
								szdMezo.getText());
		tablaAdatok.add(sz);

	}

	@FXML
	void menuItemSugó(ActionEvent event) {

	}
	
    @FXML
    void menuItemTorol(ActionEvent event) {
    	Szemely szemelyTorol=tabla.getSelectionModel().getSelectedItem();
    	tablaAdatok.remove(szemelyTorol);

    }
    @FXML
    void menuItemSzerkeszt(ActionEvent event) {
    	Szemely szemelySzerkeszt=tabla.getSelectionModel().getSelectedItem();
    	idMezo.setText(szemelySzerkeszt.getId());
    	vNevMezo.setText(szemelySzerkeszt.getVNev());
    	kNevMezo.setText(szemelySzerkeszt.getKNev());
    	szdMezo.setText(szemelySzerkeszt.getSzulD());
    	// hogyan mentse el????  	
    	
    }

	private void kezdoAdatok() {
		Szemely szemely1 = new Szemely("1", "Kis", "Imre", "1999-11-11");
		Szemely szemely2 = new Szemely("2", "Nagy", "Géza", "1992-01-03");
		Szemely szemely3 = new Szemely("3", "Ripa", "Júlia", "1987-08-31");
		tablaAdatok.add(szemely1);
		tablaAdatok.add(szemely2);
		tablaAdatok.add(szemely3);
	}

	private void tablaAdatokBeallitasa() {
		tablaID.setCellValueFactory(cellData -> cellData.getValue().idProperty());
		tablaVnev.setCellValueFactory(cellData -> cellData.getValue().vNevProperty());
		tablaKnev.setCellValueFactory(cellData -> cellData.getValue().kNevProperty());
		tablaSzD.setCellValueFactory(cellData -> cellData.getValue().SzulDProperty());
		tabla.setItems(tablaAdatok);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		kezdoAdatok();
		tablaAdatokBeallitasa();

	}

}
