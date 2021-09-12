package com.example.lab2_1;
import java.util.List;

import com.example.lab2_1.Fruit;
import com.example.lab2_1.FruitComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String argu[]) {
	//Create arraylist of user-defined class object
	
	List<Fruit> fl = new ArrayList<Fruit>();
	System.out.println("\n\nFruit List (ordered by name)");
	Fruit f1 = new Fruit(101,"Apple",1000);
	fl.add(f1);
	fl.add(new Fruit(102,"Orange",1500));
	fl.add(new Fruit(103,"Kiwi",2000));
	fl.add(new Fruit(104,"Peach",2100));
	fl.add(new Fruit(105,"Grapes",2200));
	fl.add(new Fruit(106,"Apricot",2300));
	fl.add(new Fruit(107,"Mango",2400));
	fl.add(new Fruit(108,"Plum",2500));
	fl.add(new Fruit(109,"Pear",2600));
	fl.add(new Fruit(110,"Lichy",2700));
	fl.add(new Fruit(111,"Strawberry",2800));
	
	Collections.sort(fl, new FruitComparator());
	for(Fruit f: fl) {
		System.out.println(f.toString());
	}
	System.out.println("Fruit List (reverse ordered by name)");
	
	Collections.sort(fl, new FruitComparatorDesc());
	for(int i=0; i<fl.size(); i++) {
		System.out.println(fl.get(i).toString());
	}
}
}
