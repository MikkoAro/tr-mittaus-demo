package Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class ObservationCategoryReader {
	Properties props = new Properties();
	String pathToResource = "src/Resources/ObservationCategory.properties";
	
	public ArrayList<String> getObservationCodes() {
		FileInputStream fis = null;
		try {
		    fis = new FileInputStream(pathToResource);
		    props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sortCodes(props);
	}
	
	private ArrayList<String> sortCodes(Properties props){
		ArrayList<String> observationCodes = new ArrayList<String>();
		
		for(int i = 0; i < props.size(); i++) {
			String prop = props.getProperty("obs_cat"+i);
			observationCodes.add(prop);
		}
		return observationCodes;
	}
}
