package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	
	public void readConfig()
	{
		Properties prop = new Properties();
		
		String file = "Config/config.properties";
		
		

		String browsername = prop.getProperty("browser");
	}

}
