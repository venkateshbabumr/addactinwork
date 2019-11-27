package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
public Properties prop=new Properties();
public ConfigReader() {
	File f=new File(System.getProperty("user.dir")+"src\\test\\resource\\com\\cucumber\\prop\\Config.properties");
	FileInputStream fin=new FileInputStream(f);
	
}
}
