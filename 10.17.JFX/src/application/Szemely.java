package application;

import javafx.beans.property.SimpleStringProperty;

public class Szemely {

	private SimpleStringProperty id;
	private SimpleStringProperty vNev;
	private SimpleStringProperty kNev;
	private SimpleStringProperty SzulD;
	
	public Szemely(String id, String vNev, String kNev, String SzulD) {
		this.id = new SimpleStringProperty(id);
		this.vNev = new SimpleStringProperty(vNev);
		this.kNev = new SimpleStringProperty(kNev);
		this.SzulD = new SimpleStringProperty(SzulD);
	}

	public final SimpleStringProperty idProperty() {
		return this.id;
	}
	
	public final String getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	
	public final SimpleStringProperty vNevProperty() {
		return this.vNev;
	}
	
	public final String getVNev() {
		return this.vNevProperty().get();
	}
	
	public final void setVNev(final String vNev) {
		this.vNevProperty().set(vNev);
	}
	
	public final SimpleStringProperty kNevProperty() {
		return this.kNev;
	}
	
	public final String getKNev() {
		return this.kNevProperty().get();
	}
	
	public final void setKNev(final String kNev) {
		this.kNevProperty().set(kNev);
	}
	
	public final SimpleStringProperty SzulDProperty() {
		return this.SzulD;
	}
	
	public final String getSzulD() {
		return this.SzulDProperty().get();
	}
	
	public final void setSzulD(final String SzulD) {
		this.SzulDProperty().set(SzulD);
	}
	

}
