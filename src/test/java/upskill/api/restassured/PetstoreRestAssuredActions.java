package upskill.api.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class PetstoreRestAssuredActions {
	
	public void createPet(){
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiRequestPayloads/CreatePetRequest.json")).
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			post("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));	
	}
	
	public void updatePet(){
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json")).
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			put("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/UpdatePetResponse.json")));
		
	}
	
	public void getPet(){
		given().
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			get("https://petstore.swagger.io/v2/pet/4567").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/GetPetResponse.json")));
	}

	public void deletePet(){
		given().
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			delete("https://petstore.swagger.io/v2/pet/4567").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/DeletePetResponse.json")));
	}
}