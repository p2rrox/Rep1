package gen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class Prop_Gen {

	public static String prop(String path, String key)
			throws FileNotFoundException, IOException {

		Properties p = new Properties();

		p.load(new FileInputStream(path));

		String data = p.getProperty(key);

		Reporter.log(data);
		
		return data;
	}
}
