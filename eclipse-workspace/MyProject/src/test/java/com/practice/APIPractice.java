package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIPractice {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException, ParseException {
		
//		RequestSpecification reqSpc = RestAssured.given();
//		//1).Post---Auth to create a token
//		reqSpc.header("Content-Type","application/json");
//		reqSpc.body("{\r\n"
//				+ "    \"username\" : \"admin\",\r\n"
//				+ "    \"password\" : \"password123\"\r\n"
//				+ "}");
//		Response post = reqSpc.post("https://restful-booker.herokuapp.com/auth");
//		int statusCode = post.getStatusCode();
//		System.out.println(statusCode);
//		
//		String asPrettyString = post.asPrettyString();
//		System.out.println(asPrettyString);
//		JSONParser jsonParser=new JSONParser();
//		Object object = jsonParser.parse(asPrettyString);
//		JSONObject jsonObject=(JSONObject) object;
//		Object object2 = jsonObject.get("token");
//		System.out.println(String.valueOf(object2));
//		
//		//2).Get--->Booking id
//		Response response = reqSpc.get("https://restful-booker.herokuapp.com/booking");
//		int statusCode1 = response.getStatusCode();
//		System.out.println(statusCode1);
//		String asPrettyString2 = response.asPrettyString();
//		Object object3 = jsonParser.parse(asPrettyString2);
//		JSONArray array=(JSONArray) object3;
//		Object object4 = array.get(5);
//		JSONObject jsonObject4=(JSONObject) object4;
//		Object object5 = jsonObject4.get("bookingid");
//		String bookingId = String.valueOf(object5);
//		System.out.println(bookingId);
//		
//		JsonPath jsonPath = response.jsonPath();
//		Object object6 = jsonPath.get("[1].bookingid");
//		System.out.println("1st index "+String.valueOf(object6));
//		//Get -->Details in particular booking ID
//		reqSpc.header("Content-Type","application/json");
//		
//		Response response2 = reqSpc.get("https://restful-booker.herokuapp.com/booking/"+bookingId);
//		int statusCode2 = response2.getStatusCode();
//		System.out.println(statusCode2);
//		String asPrettyString3 = response2.asPrettyString();
//		System.out.println(asPrettyString3);
		
		
		
		
		RequestSpecification reqSpec = RestAssured.given();
		List<Header> listHeader=new ArrayList<>();
		Header h1=new Header("Accept", "application/json");
		Header h2=new Header("Content-type", "application/json");
		Header h3=new Header("Authorization", "Bearer ACCESS-TOKEN");
		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);
		Headers headers=new Headers(listHeader);
		reqSpec.headers(headers);
		Response response = reqSpec.get("https://gorest.co.in/public/v2/users");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
		
		
	}
}
