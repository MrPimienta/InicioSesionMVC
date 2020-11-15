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
	Label lb_contraseña;
	
	TextField tf_usuario;
	PasswordField pf_contraseña;
	
	Button bt_acceder;
	Button bt_cancelar;
	
	public Vista() { //CONSTRUCTOR DE LA VISTA DE LA APLICACION
		super();
		
		lb_usuario = new Label("Usuario:");
		lb_contraseña = new Label("Contraseña:");
		
		tf_usuario = new TextField();
		tf_usuario.setPromptText("Usuario"); //TEXTO QUE APARECERA POR DEFECTO DENTRO DEL CAMPO
		
		pf_contraseña = new PasswordField();
		pf_contraseña.setPromptText("Contraseña"); ////TEXTO QUE APARECERA POR DEFECTO DENTRO DEL CAMPO
		
		GridPane centro = new GridPane();
		centro.setHgap(20); //ancho de espacio entre columnas
		centro.setVgap(20); //alto de espacio entre filas
		centro.setAlignment(Pos.CENTER);
		
		//AÑADIMOS LAS FILAS MOSTRAR EN CENTRO
		centro.addRow(0, lb_usuario, tf_usuario);
		centro.addRow(1, lb_contraseña, pf_contraseña);
		
		//BOTONES
		bt_acceder = new Button();
		bt_acceder.setText("Acceder");
		
		bt_cancelar = new Button();
		bt_cancelar.setText("Cancelar");
		
		HBox hb_botones = new HBox(); //hbox donde introduciremos los botones acceder y cancelar
		hb_botones.setAlignment(Pos.TOP_CENTER);
		hb_botones.setSpacing(10);
		hb_botones.getChildren().addAll(bt_acceder, bt_cancelar); //añadimos los botones al hbox hb_botones
		
		//AÑADIMOS EL HBOX CON LOS BOTONES AL CENTRO
		centro.add(hb_botones,0,2);
		GridPane.setColumnSpan(hb_botones,2); //Colocamos el hbox de los botones en la columna 2, para tenerlos mas centrados
		this.setCenter(centro);
	}
	
	public void accesoPermitido() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Iniciar Sesión");
		alerta.setHeaderText("Acceso Permitido");
		alerta.setContentText("Las credenciales de acceso son válidas");
		alerta.showAndWait();
		
	}
	
	public void accesoDenegado() {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Iniciar Sesión");
		alerta.setHeaderText("Acceso No Permitido");
		alerta.setContentText("Las credenciales de acceso NO son válidas");
		alerta.showAndWait();
	}
	
	
	//GETTERS Y SETTERS//////////////////////////////////////////////////
	public Label getLb_usuario() {
		return lb_usuario;
	}

	public void setLb_usuario(Label lb_usuario) {
		this.lb_usuario = lb_usuario;
	}

	public Label getLb_contraseña() {
		return lb_contraseña;
	}

	public void setLb_contraseña(Label lb_contraseña) {
		this.lb_contraseña = lb_contraseña;
	}

	public TextField getTf_usuario() {
		return tf_usuario;
	}

	public void setTf_usuario(TextField tf_usuario) {
		this.tf_usuario = tf_usuario;
	}

	public PasswordField getPf_contraseña() {
		return pf_contraseña;
	}

	public void setPf_contraseña(PasswordField pf_contraseña) {
		this.pf_contraseña = pf_contraseña;
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
