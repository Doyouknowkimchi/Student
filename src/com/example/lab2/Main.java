package com.example.lab2;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String argu[]) {
	//Create arraylist of user-defined class object
	List<Student> al = new ArrayList<Student>();
	System.out.println("Student List (ordered by name)");
	
	Student s1 = new Student(101,"Kim",23);
	al.add(s1);
	
	Student s2 = new Student(102,"Lee",21);
	al.add(s2);
	
	al.add(new Student(103,"Park",25));
	al.add(new Student(104,"Choi",25));
	al.add(new Student(105,"Jung",25));
	al.add(new Student(106,"Kang",25));
	al.add(new Student(107,"Jo",25));
	al.add(new Student(108,"Yoon",25));
	al.add(new Student(109,"Jang",25));
	al.add(new Student(110,"LIM",25));	
	
	Collections.sort(al);
	//Traverse elements of arraylist
	for(Student s : al) { // : 이거 뭔지 모르겠다.
		System.out.println(s.toString());
	}
	System.out.println("Student List (reverse ordered by name)");
	
	
	Collections.sort(al, Collections.reverseOrder());
	//Traverse elements of arraylist
	for(Student s : al) { // : 이거 뭔지 모르겠다.
		System.out.println(s.toString());
	}
	//remove an object from arraylist
	al.remove(s2);
	System.out.println("One student removed!");
	
	//Traverse elements of arraylist (method #2)
	for(int i = 0; i<al.size(); i++) {
		System.out.println(al.get(i).toString());
	}
	
}
}
