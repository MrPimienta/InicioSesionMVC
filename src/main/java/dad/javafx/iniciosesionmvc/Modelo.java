package dad.javafx.iniciosesionmvc;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {
	
	//declaramos el usuario y la contrase�a como stringproperties para los bindeos
	private StringProperty usuario = new SimpleStringProperty(); 
	private StringProperty contrase�a = new SimpleStringProperty();
	
	private HashMap <String, String> datos_fichero; //hashmap almacena referencias a objetos
	
	public Modelo(HashMap <String, String> datos_fichero) {
		this.datos_fichero = datos_fichero;
	}

	public HashMap <String, String> getDatos_fichero() {
		return datos_fichero;
	}

	public void setDatos_fichero(HashMap <String, String> datos_fichero) {
		this.datos_fichero = datos_fichero;
	}

	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	

	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	

	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	

	public final StringProperty contrase�aProperty() {
		return this.contrase�a;
	}
	

	public final String getContrase�a() {
		return this.contrase�aProperty().get();
	}
	

	public final void setContrase�a(final String contrase�a) {
		this.contrase�aProperty().set(contrase�a);
	}
	
	
	
	
}
