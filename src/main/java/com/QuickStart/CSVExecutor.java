package com.QuickStart;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVExecutor {

	public static void main(String[] args) {
		try {
			Reader fileReader = Files.newBufferedReader(Paths.get("demo1.csv"));
//		CSVReader csvReader = new CSVReader(fileReader);
//		String[] nextRow;
//		while((nextRow = csvReader.readNext())!=null) {
//			System.out.println(nextRow[0]);
			// System.out.println(nextRow[1]);
			// System.out.println(nextRow[2]);
			// System.out.println(nextRow[3]);
			// System.out.println("==================");}
			
			CsvToBean<CSVUser> csvUser = new CsvToBeanBuilder(fileReader).withType(CSVUser.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<CSVUser> itr = csvUser.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
