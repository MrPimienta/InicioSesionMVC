package dad.javafx.iniciosesionmvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application{
	
	private Controlador controller = new Controlador();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene escena = new Scene(controller.getView(), 400, 200);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Inicio de Sesion MVC");
		primaryStage.show();
	}
	
	public static void main(String[] ar) {
		launch(ar);
	}
	
}
