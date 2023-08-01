package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/***
 * 
 * @author Sudarshan
 *
 */
public class Read_Data implements Constants_Values {

	public static String UserData(String Key) throws IOException {
		FileInputStream fis = new FileInputStream(PROPERTIES_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;

	}
}
