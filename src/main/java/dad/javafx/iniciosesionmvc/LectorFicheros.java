package dad.javafx.iniciosesionmvc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LectorFicheros {
	
	public static HashMap<String, String> leerFichero(String nombre_fichero) throws IOException{
		
		
			HashMap<String, String> resultado = new HashMap<String, String>();
			FileReader lector = new FileReader(new File(nombre_fichero));
			BufferedReader bf_lector = new BufferedReader(lector);
			String[] actual;
			String linea;
		
			while((linea = bf_lector.readLine()) != null) {
				actual = linea.split(",");
				resultado.put(actual[0], actual[1]);
				
			}
			
		bf_lector.close();
		
		return resultado;
		
		
	}
}
