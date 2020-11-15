package dad.javafx.iniciosesionmvc;

import java.io.IOException;
import javafx.application.Platform;
import org.apache.commons.codec.digest.DigestUtils;

public class Controlador {
	
	private Vista vista = new Vista();
	private Modelo modelo;
	
	public Controlador(){ 
		
		try {
		modelo = new Modelo(LectorFicheros.leerFichero("users.csv"));
		
		}catch(IOException e) { //si no encuentra el archivo, la aplicacion no se inicia
			System.out.println("Archivo no encontrado.");
			Platform.exit();
		}
		
		//BOTON QUE CERRARA LA APLICACION
		vista.getBt_cancelar().setOnAction(e -> Platform.exit());
		//BOTON QUE COMPROBARA SI EL USUARIO ESTA REGISTRADO Y HA INTRODUCIDO LOS DATOS CORRECTOS
		vista.getBt_acceder().setOnAction(e -> comprobar());
		
		//BINDINGS DE LOS VALORES DEL TEXTFIELD Y PASSWORDFIELD
		modelo.usuarioProperty().bind(vista.getTf_usuario().textProperty());
		modelo.contraseñaProperty().bind(vista.getPf_contraseña().textProperty());
	}
	
	private void comprobar() {
		if(modelo.getDatos_fichero().containsKey(modelo.getUsuario())) {
			String md5 = DigestUtils.md5Hex(modelo.getContraseña()).toUpperCase();
			if(modelo.getDatos_fichero().get(modelo.getUsuario()).equals(md5))
				vista.accesoPermitido();
		}
		else
			vista.accesoDenegado();
	}
	
	
	
	public Vista getView() {
		return vista;
	}
	
	public void setView(Vista vista) {
		this.vista = vista;
	}
}
