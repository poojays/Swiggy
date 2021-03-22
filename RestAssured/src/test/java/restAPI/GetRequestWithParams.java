package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWithParams {
  
   
   

	  @Test
	    
	    public void test1() {
	        
	         RestAssured.baseURI = "http://localhost:3000/employees";
	         
	         RequestSpecification request = RestAssured.given();
	         
	         Response response = request.param("id", "2").get();
	         
	         String responsebody = response.getBody().asString();
	         
	         System.out.println("Response Body" + responsebody);
	        //CHECKING THE RESPONSE CODE 
	        int responsecode= response.getStatusCode();
	        Assert.assertEquals(200, responsecode);
	        
	        //CHECKING THE RESPONSE HEADERS
	       
	        String contentType= response.header("Content-Type");
	        Assert.assertEquals("application/json; charset=utf-8",contentType);
	        
	        //checking name in response
	        
	        Assert.assertTrue(responsebody.contains("David"));
	        
	        //checking the exact node
	        
	        JsonPath jpath=response.jsonPath();
	        
	       List <String> name = jpath.get("name");
	        
	        System.out.println(name.get(0).contains("David"));	        		
	        
	     
	        
	            
	         
	         
	    }

	 

	 

	 

	}

	 