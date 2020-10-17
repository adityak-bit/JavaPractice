package com.QuickStart;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {

	@CsvBindByName
	String name;
	@CsvBindByName
	String email;
	@CsvBindByName
	long phone;
	@CsvBindByName
	String country;
	
	@Override
	public String toString() {
		return "CSVUser [name=" + name + ", email=" + email + ", phone=" + phone + ", country=" + country + "]";
	}
}
