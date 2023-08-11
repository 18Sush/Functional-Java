package com.casestudy;

import java.util.List;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Person> personList = new ArrayList<>();

	        personList.add(new Person("Alice", "alice@example2.com"));
	        personList.add(new Person("Bob", "bob@example2.com"));
	        personList.add(new Person("Ali", "ali@example2.com"));

	        personList.forEach(person -> System.out.println(person.getPersonName() + ": " + person.getEmailld()));
	}

}
