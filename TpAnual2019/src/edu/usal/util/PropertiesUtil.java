package edu.usal.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties properties = new Properties();
	private static PropertiesUtil objeto = null;
	private static Properties GetProperty() throws FileNotFoundException, IOException{
		
		properties.load (new FileReader("config.properties"));
		return properties;
	}
	public static PropertiesUtil getInstance() {
		if (objeto == null)
			objeto = new PropertiesUtil();
		return objeto;
		
	}
	
	public static String getPropertyCliente() {
		return properties.getProperty("pathCliente");
	}
	
}
