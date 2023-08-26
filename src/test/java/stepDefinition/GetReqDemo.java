package stepDefinition;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetReqDemo {
	
	
		
		@Test
		public void testGetReq()
		{
			RestAssured.baseURI="https://demo.cyclos.org/api";
			
			
			//RequestSpecification req=RestAssured.given();
			RequestSpecification req=RestAssured.given().auth().preemptive().basic("demo", "1234");
			
			
			// Calling Get Request
			Response res=req.get("/auth");
			
			
			//System.out.println(res.getStatusCode());
			
			System.out.println(res.getBody().asString());
			// Verify response code
			assertEquals(res.getStatusCode(),200);
			System.out.println(res.prettyPrint());
			// Verify response body
			assertTrue(res.getBody().asString().contains("Demo user"));
		}

	}



