package restAPI;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestwithLogger {
	 static Logger logger = Logger.getLogger(Loggers.class);
	    Response response;
	    
	    @BeforeTest
	    public void setup() {
	        
	       // BasicConfigurator.configure();
	        
	        PropertyConfigurator.configure("log4j.properties");
	        logger.setLevel(Level.DEBUG);
	        
	        response = RestAssured.given()
	                .baseUri("http://localhost:8088/employees")
	                .when()
	                .get();
	    }
	    
	    @Test
	    public void test1() {
	        
	        logger.info("*************************Inside CheckStatus Code********************");

	 

	 

	 

	        int statusCode = response.getStatusCode();
	        
	        logger.info("StatusCode ==> " +statusCode);
	        
	        Assert.assertEquals(statusCode, 200);
	    }
	}


