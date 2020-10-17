package com.QuickStart;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class CSVExecutor {

	public static void main(String[] args) {
		
	try {
		Reader fileReader = Files.newBufferedReader(Paths.get("demo1.csv"));
		CSVReader csvReader = new CSVReader(fileReader);
		String[] nextRow;
		while((nextRow = csvReader.readNext())!=null) {
			System.out.println(nextRow[0]);
			System.out.println(nextRow[1]);
			System.out.println(nextRow[2]);
			System.out.println(nextRow[3]);
			System.out.println("==================");
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
