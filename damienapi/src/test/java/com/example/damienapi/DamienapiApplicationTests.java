package com.example.damienapi;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

import io.restassured.RestAssured;

import net.thucydides.core.annotations.Title;
import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import java.util.HashMap;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(SerenityRunner.class)
public class DamienapiApplicationTests {

	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://localhost:8085/";
	}

	@Title("testing if response time is less than 10s")
	@Test
	public void test001(){
		SerenityRest.given().when().get("coins/bitcoin").then().log().all().statusCode(200).spec(ResponseValidation.responseSpecification);
	}

	@Title("get name of id bitcoin")
	@Test
	public void test002(){
		HashMap<String,Object> value= SerenityRest.given().when().get("coins/bitcoin").then().log().all().statusCode(200).extract().path("findAll{it.id='bitcoin'}.get(1)");

		System.out.println("the name value of bitcoin is "+value);
		assertThat(value,hasValue("Bitcoin"));

	}

	@Title("test if api returns 404 for invalid currency")
	@Test
	public void test003(){
		SerenityRest.given().when().get("coins/bitcoi").then().log().all().statusCode(404).spec(ResponseValidation.responseSpecification);
	}

	@Title("test pagination is 10")
	public void test004() {
		SerenityRest.given().when().get("/coins/markets?vs_currency=aud&id=bitcoin").then().assertThat().statusCode(200).body("size()", is(10));;
	}

	@Title("testing if response time is less than 10s")
	@Test
	public void test005(){
		SerenityRest.given().when().get("/coins/markets?vs_currency=aud&id=bitcoin").then().log().all().statusCode(200).spec(ResponseValidation.responseSpecification);
	}

	@Title("get name of id bitcoin")
	@Test
	public void test006(){
		SerenityRest.given().when().get("/coins/markets?vs_currency=aud&id=bitcoin").then().log().all().statusCode(200).extract().path("findAll{})");


	}





}
