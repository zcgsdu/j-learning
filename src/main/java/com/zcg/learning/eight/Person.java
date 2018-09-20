package com.zcg.learning.eight;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public enum Sex {
        MALE, FEMALE
    }
	
	String name;
    Integer age;
    Sex gender;
    String emailAddress;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

    public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age);
    }
    
    public void printPerson() {
        System.out.println(this);
    }
    
    public static List<Person> createRoster(){
    	List<Person> list = new ArrayList<>();
    	Person p1 = new Person();
    	p1.setAge(10);
    	p1.setName("zhancg");
    	
    	Person p2 = new Person();
    	p2.setAge(11);
    	p2.setName("bb");
    	
    	Person p3 = new Person();
    	p3.setAge(5);
    	p3.setName("happy");
    	
    	list.add(p1);
    	list.add(p2);
    	list.add(p3);
    	return list;
    }
    
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", emailAddress="
				+ emailAddress + "]";
	}
	
}
