package com.lt.crs.utils;

public class Extractor {
	
	
	public static String getNbr(String str) 
    { 
        // Replace each non-numeric number with a space
        str = str.replaceAll("[^\\d]", " "); 
        // Remove leading and trailing spaces
        str = str.trim(); 
        // Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " "); 
  
        return str; 
    } 
}
