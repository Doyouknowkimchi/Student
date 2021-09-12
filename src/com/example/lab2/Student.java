package com.example.lab2;

public class Student implements Comparable<Student>{
	int no;
	public String name;
	int age;
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name); //어떤 의미인지 찾아보기
	}
	
	public Student(int s_no, String s_name, int s_age) {
		no = s_no;
		name = s_name;
		age = s_age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student [no= " + no + ", name= " + name + ", age= " + age + "]";
	}


	
}
