package com.csulb.constraint.programming.river.crossing.Util;

import java.util.HashSet;
import java.util.Set;

import com.csulb.constraint.programming.river.crossing.bo.State;

public class GetNextStates {
	public static Set<State> states(State s) {
		Set<State> states = new HashSet<State>();
		
		State state1 = clone(s);
		
		boolean leftBoat = !state1.isBoat();
		boolean leftMother = !state1.isMother();
		boolean leftFather = !state1.isFather();
		boolean leftPolice = !state1.isPolice();
		
		boolean leftSon1 = !state1.isSon1();
		boolean leftSon2 = !state1.isSon2();
		boolean leftDaughter1 = !state1.isDaughter1();
		boolean leftDaughter2 = !state1.isDaughter2();
		boolean leftThief = !state1.isThief();
				
		if (leftBoat) {
			if (leftMother && leftFather) {
				State state=clone(state1);
				state.setMother(true);
				state.setFather(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			if (leftMother && leftPolice) {
				State state=clone(state1);
				state.setMother(true);
				state.setPolice(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			if (leftPolice && leftFather) {
				State state=clone(state1);
				state.setPolice(true);
				state.setFather(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			if (leftMother) {
				if (leftSon1) {
					State state=clone(state1);
					state.setMother(true);
					state.setSon1(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftSon2) {
					State state=clone(state1);
					state.setMother(true);
					state.setBoat(true);
					state.setSon2(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftDaughter1) {
					State state=clone(state1);
					state.setMother(true);
					state.setBoat(true);
					state.setDaughter1(true);
					if (checkStateValidity(state))
						states.add(state);		
				}
				if (leftDaughter2) {
					State state=clone(state1);
					state.setMother(true);
					state.setDaughter2(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setMother(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			if (leftFather) {
				if (leftSon1) {
					State state=clone(state1);
					state.setFather(true);
					state.setBoat(true);
					state.setSon1(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftSon2) {
					State state=clone(state1);
					state.setFather(true);
					state.setBoat(true);
					state.setSon2(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftDaughter1) {
					State state=clone(state1);
					state.setFather(true);
					state.setDaughter1(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);			
				}
				if (leftDaughter2) {
					State state=clone(state1);
					state.setFather(true);
					state.setBoat(true);
					state.setDaughter2(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setFather(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			if (leftPolice) {
				if (leftSon1) {
					State state=clone(state1);
					state.setPolice(true);
					state.setSon1(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftSon2) {
					State state=clone(state1);
					state.setPolice(true);
					state.setSon2(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftDaughter1) {
					State state=clone(state1);
					state.setPolice(true);
					state.setBoat(true);
					state.setDaughter1(true);
					if (checkStateValidity(state))
						states.add(state);		
				}
				if (leftDaughter2) {
					State state=clone(state1);
					state.setPolice(true);
					state.setDaughter2(true);
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (leftThief) {
					State state=clone(state1);
					state.setPolice(true);
					state.setThief(true);	
					state.setBoat(true);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setPolice(true);
				state.setBoat(true);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			
		} else { // raft is on the right side
			if ((!leftMother) && (!leftFather)) {
				State state=clone(state1);
				state.setFather(false);
				state.setMother(false);
				state.setBoat(false);
				if (checkStateValidity(state))
					states.add(state);
			}
			if ((!leftMother) && (!leftPolice)) {
				State state=clone(state1);
				state.setPolice(false);
				state.setBoat(false);
				state.setMother(false);	
				if (checkStateValidity(state))
					states.add(state);
			}
			if ((!leftPolice) && (!leftFather)) {
				State state=clone(state1);
				state.setPolice(false);
				state.setFather(false);	
				state.setBoat(false);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			
			if (!leftMother) {
				if (!leftSon1) {
					State state=clone(state1);
					state.setSon1(false);
					state.setMother(false);	
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftSon2) {
					State state=clone(state1);
					state.setSon2(false);
					state.setMother(false);	
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftDaughter1) {
					State state=clone(state1);
					state.setDaughter1(false);
					state.setBoat(false);
					state.setMother(false);	
					if (checkStateValidity(state))
						states.add(state);			
				}
				if (!leftDaughter2) {
					State state=clone(state1);
					state.setDaughter2(false);
					state.setMother(false);	
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setMother(false);	
				state.setBoat(false);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			if (!leftFather) {
				if (!leftSon1) {
					State state=clone(state1);
					state.setSon1(false);
					state.setBoat(false);
					state.setFather(false);	
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftSon2) {
					State state=clone(state1);
					state.setSon2(false);
					state.setFather(false);	
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftDaughter1) {
					State state=clone(state1);
					state.setDaughter1(false);
					state.setBoat(false);
					state.setFather(false);	
					if (checkStateValidity(state))
						states.add(state);			
				}
				if (!leftDaughter2) {
					State state=clone(state1);
					state.setDaughter2(false);
					state.setFather(false);	
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setFather(false);	
				state.setBoat(false);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			if (!leftPolice) {
				if (!leftSon1) {
					State state=clone(state1);
					state.setSon1(false);
					state.setBoat(false);
					state.setPolice(false);	
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftSon2) {
					State state=clone(state1);
					state.setSon2(false);
					state.setPolice(false);
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftDaughter1) {
					State state=clone(state1);
					state.setDaughter1(false);
					state.setBoat(false);
					state.setPolice(false);
					if (checkStateValidity(state))
						states.add(state);			
				}
				if (!leftDaughter2) {
					State state=clone(state1);
					state.setDaughter2(false);
					state.setPolice(false);
					state.setBoat(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				if (!leftThief) {
					State state=clone(state1);
					state.setThief(false);
					state.setBoat(false);
					state.setPolice(false);
					if (checkStateValidity(state))
						states.add(state);
				}
				State state=clone(state1);
				state.setPolice(false);
				state.setBoat(false);
				if (checkStateValidity(state))
					states.add(state);
			}
			
			
		}
		return states;
	}
	
	private static State clone(State s){
		State state=new State(s.isFather(), s.isMother(), s.isPolice(), s.isThief(), s.isSon1(), s.isSon2(), s.isDaughter1(), s.isDaughter2(), s.isBoat());
		return state;
		
	}

	public static boolean checkStateValidity(State state){
		boolean father=state.isFather();
		boolean mother=state.isMother();
		boolean police=state.isPolice();
		boolean thief=state.isThief();
		boolean son1=state.isSon1();
		boolean son2=state.isSon2();
		 boolean daughter1=state.isDaughter1();
		 boolean daughter2=state.isDaughter2();
		 boolean boat=state.isBoat();
		 boolean flag1,flag2,flag3;
		 if (((!father) && (mother) && (!daughter1 || !daughter2)) || 
					((father) && (!mother) && (daughter1 || daughter2))){			 
			 flag1=false;
		 }
		 else{
			 flag1=true;
		 }
		 
		 if (((!mother) && (father) && (!son1 || !son2)) || 
					((mother) && (!father) && (son1 || son2))){
			 flag2= false;
		 }
		 else{
			 flag2=true;
		 }
		
		 if( 
					(
						((!police) && (thief)) && ((mother) || (father) || (son1) || (son2) || (daughter1) || (daughter2)) 
					) 
					||
					( 
						((police) && (!thief)) && ((!mother) || (!father) || (!son1) || (!son2) || (!daughter1) || (!daughter2)) 
					) 
			)
				flag3=false;
		 else{
			 flag3=true;
		 }
				return flag1 && flag2 && flag3;
	}
}
