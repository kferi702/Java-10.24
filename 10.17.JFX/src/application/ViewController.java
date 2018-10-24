package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    @FXML
    private TableView<?> tabla;

    @FXML
    private TextField idMezo;

    @FXML
    private TextField vNevMezo;

    @FXML
    private TextField kNevMezo;

    @FXML
    private TextField szdMezo;

    @FXML
    void MenuItemKilepes(ActionEvent event) {

    }

    @FXML
    void hozzadGomb(ActionEvent event) {
    	System.out.println(idMezo.getText());
    	System.out.println(vNevMezo.getText());
    	System.out.println(kNevMezo.getText());
    	System.out.println(szdMezo.getText());
    }

    @FXML
    void menuItemSugó(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

