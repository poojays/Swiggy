package restAPI;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Loggers {
	
	static Logger loggers= Logger.getLogger(Loggers.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		loggers.debug("Hello World");		
	}
	

}
