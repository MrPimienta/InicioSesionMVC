package dad.javafx.iniciosesionmvc;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vista extends BorderPane{
	
	Label lb_usuario;
	Label lb_contrase�a;
	
	TextField tf_usuario;
	PasswordField pf_contrase�a;
	
	Button bt_acceder;
	Button bt_cancelar;
	
	public Vista() { //CONSTRUCTOR DE LA VISTA DE LA APLICACION
		super();
		
		lb_usuario = new Label("Usuario:");
		lb_contrase�a = new Label("Contrase�a:");
		
		tf_usuario = new TextField();
		tf_usuario.setPromptText("Usuario"); //TEXTO QUE APARECERA POR DEFECTO DENTRO DEL CAMPO
		
		pf_contrase�a = new PasswordField();
		pf_contrase�a.setPromptText("Contrase�a"); ////TEXTO QUE APARECERA POR DEFECTO DENTRO DEL CAMPO
		
		GridPane centro = new GridPane();
		centro.setHgap(20); //ancho de espacio entre columnas
		centro.setVgap(20); //alto de espacio entre filas
		centro.setAlignment(Pos.CENTER);
		
		//A�ADIMOS LAS FILAS MOSTRAR EN CENTRO
		centro.addRow(0, lb_usuario, tf_usuario);
		centro.addRow(1, lb_contrase�a, pf_contrase�a);
		
		//BOTONES
		bt_acceder = new Button();
		bt_acceder.setText("Acceder");
		
		bt_cancelar = new Button();
		bt_cancelar.setText("Cancelar");
		
		HBox hb_botones = new HBox(); //hbox donde introduciremos los botones acceder y cancelar
		hb_botones.setAlignment(Pos.TOP_CENTER);
		hb_botones.setSpacing(10);
		hb_botones.getChildren().addAll(bt_acceder, bt_cancelar); //a�adimos los botones al hbox hb_botones
		
		//A�ADIMOS EL HBOX CON LOS BOTONES AL CENTRO
		centro.add(hb_botones,0,2);
		GridPane.setColumnSpan(hb_botones,2); //Colocamos el hbox de los botones en la columna 2, para tenerlos mas centrados
		this.setCenter(centro);
	}
	
	public void accesoPermitido() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Iniciar Sesi�n");
		alerta.setHeaderText("Acceso Permitido");
		alerta.setContentText("Las credenciales de acceso son v�lidas");
		alerta.showAndWait();
		
	}
	
	public void accesoDenegado() {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Iniciar Sesi�n");
		alerta.setHeaderText("Acceso No Permitido");
		alerta.setContentText("Las credenciales de acceso NO son v�lidas");
		alerta.showAndWait();
	}
	
	
	//GETTERS Y SETTERS//////////////////////////////////////////////////
	public Label getLb_usuario() {
		return lb_usuario;
	}

	public void setLb_usuario(Label lb_usuario) {
		this.lb_usuario = lb_usuario;
	}

	public Label getLb_contrase�a() {
		return lb_contrase�a;
	}

	public void setLb_contrase�a(Label lb_contrase�a) {
		this.lb_contrase�a = lb_contrase�a;
	}

	public TextField getTf_usuario() {
		return tf_usuario;
	}

	public void setTf_usuario(TextField tf_usuario) {
		this.tf_usuario = tf_usuario;
	}

	public PasswordField getPf_contrase�a() {
		return pf_contrase�a;
	}

	public void setPf_contrase�a(PasswordField pf_contrase�a) {
		this.pf_contrase�a = pf_contrase�a;
	}

	public Button getBt_acceder() {
		return bt_acceder;
	}

	public void setBt_acceder(Button bt_acceder) {
		this.bt_acceder = bt_acceder;
	}

	public Button getBt_cancelar() {
		return bt_cancelar;
	}

	public void setBt_cancelar(Button bt_cancelar) {
		this.bt_cancelar = bt_cancelar;
	}
	
	
	
	
	
}
