package restAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequest1 {
	 Map<String, Object> map = new HashMap<String, Object>();

	 

	    
     public void test1() {
         
         
                 
         map.put("firstName","Venky123");
         map.put("lastName", "Venky123");
         map.put("salary","10000");
         map.put("email","Venky@xtz.com");
         
     
            RestAssured.given()
            .baseUri("http://localhost:8088/")
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(map)
            .when()
            .post("employees")
            .then()
            .statusCode(201)
            .log()
            .body();
     }  
    
     @Test
     public void test2() throws IOException {
         
        
         String jsonfile = new String(Files.readAllBytes(Paths.get("input.json")));
        
         RestAssured.given()
            .baseUri("http://localhost:8088/employees")
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(jsonfile)
            .when()
            .post()
            .then()
            .statusCode(201)
            .log()
            .all();
        
        
        
    
        
        
    }
            
}


