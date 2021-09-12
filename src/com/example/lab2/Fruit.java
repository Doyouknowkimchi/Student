package com.example.lab2;
import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public Fruit(int f_no, String f_name, int f_price) {
		no = f_no;
		name = f_name;
		price = f_price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Fruit [no= " + no + ", name= " + name + ", price= " + price + "]";
	}
}

class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
}
