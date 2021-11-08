package com.lambda.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import java.util.function.Function;

public class CreateString {

	public static void main(String[] args) {
				 
				List<String> str = Arrays.asList("Aman", "Shivam","Rishab");
				
				Function<List<String>,List<String>> function = (string) -> {
					List<String> stringList = new ArrayList<String>();
					for (String s : string) {
					stringList.add(""+s.charAt(0));
				}  return stringList;};
				
				System.out.println(function.apply(str));	

	}

}
