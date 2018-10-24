
import javafx.beans.property.*;;
public class Teszt {

 private SimpleIntegerProperty id;

public final SimpleIntegerProperty idProperty() {
	return this.id;
}


public final int getId() {
	return this.idProperty().get();
}


public final void setId(final int id) {
	this.idProperty().set(id);
}

}
