package com.csulb.constraint.programming.river.crossing.Util;

import java.util.List;
import java.util.Scanner;

import com.csulb.constraint.programming.river.crossing.bo.Node;
import com.csulb.constraint.programming.river.crossing.bo.State;

public class TestMain {
	public static void main(String[] args) {
		boolean father = false;
		boolean mother = false;
		boolean police = false;
		boolean thief = false;
		boolean son1 = false;
		boolean son2 = false;
		boolean daughter1 = false;
		boolean daughter2 = false;
		boolean boat = false;
		 String s="";
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter father");
		 s=scanner.next();
		 father=Boolean.parseBoolean(s);
		
		 System.out.println("Enter mother");
		 s=scanner.next();
		 mother=Boolean.parseBoolean(s);
		
		 System.out.println("Enter son1");
		 s=scanner.next();
		 son1=Boolean.parseBoolean(s);
		
		 System.out.println("Enter son2");
		 s=scanner.next();
		 son2=Boolean.parseBoolean(s);
		
		 System.out.println("Enter daughter1");
		 s=scanner.next();
		 daughter1=Boolean.parseBoolean(s);
		
		 System.out.println("Enter daughter2");
		 s=scanner.next();
		 daughter2=Boolean.parseBoolean(s);
		
		 System.out.println("Enter police");
		 s=scanner.next();
		 police=Boolean.parseBoolean(s);
		
		 System.out.println("Enter thief");
		 s=scanner.next();
		 thief=Boolean.parseBoolean(s);
		
		 System.out.println("Enter boat");
		 s=scanner.next();
		 boat=Boolean.parseBoolean(s);
		
		State state = new State(father, mother, police, thief, son1, son2, daughter1, daughter2, boat);
		Node node = new Node();
		node.setState(state);

		SearchProcess searchProcess = new SearchProcess();
		List<State> states = searchProcess.search(node, new FIFOQueue<Node>());
		if (states.isEmpty()) {
			System.out.println("No optimal solution");
		} else {
			for (State state1 : states) {
				System.out.println(state1.getState());
			}
		}
	}
}
