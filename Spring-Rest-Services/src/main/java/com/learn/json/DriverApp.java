package com.learn.json;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverApp {
	
	public static void main(String Args[]) {
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			Student theStudent = mapper.readValue(new File("Data/sample-full.json"),Student.class);
			System.out.println("FirstName --->"+theStudent.getFirstName());
			System.out.println("lastName --->"+theStudent.getLastName());
			System.out.println("Address-->"+theStudent.getAddress());
			System.out.println("Languages--->"+Arrays.toString(theStudent.getLanguages()));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
