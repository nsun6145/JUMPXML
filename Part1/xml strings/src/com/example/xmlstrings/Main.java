package com.example.xmlstrings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import com.example.dataprovider.DataProvider;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = DataProvider.DATADIR + "customers.xml";
		String fullPath = "C:\\Users\\ndog7\\Documents\\JUMP\\Ex_Files_XML_Java\\Ex_Files_XML_Java\\Exercise Files\\01_GettingStarted\\DataProvider\\DataProvider\\data";
		System.out.println(Paths.get("").toAbsolutePath().toString());
		StringBuilder builder = new StringBuilder();
		
		int content;
		try {
			FileReader reader = new FileReader(new File("customers.xml"));
			while((content = reader.read()) != -1) {
				builder.append((char)content);
			}
			
			reader.close();
			System.out.println(builder.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
