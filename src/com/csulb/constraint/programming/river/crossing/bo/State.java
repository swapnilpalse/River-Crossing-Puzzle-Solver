package com.csulb.constraint.programming.river.crossing.bo;

public class State{
	private boolean father;
	private boolean mother;
	private boolean police;
	private boolean thief;
	private boolean son1;
	private boolean son2;
	private boolean daughter1;
	private boolean daughter2;
	private boolean boat;
	private String state; 
	public State(){
		
	}
	public String getState() {
		String s=""+father+","+mother+","+police+","+thief+","+son1+","+son2+","+daughter1+","+daughter2+","+boat;
		return s;
	}
//	public void setState(String state) {
//		this.state = state;
//	}
	public State(boolean father, boolean mother, boolean police, boolean thief, boolean son1, boolean son2,
			boolean daughter1, boolean daughter2, boolean boat) {
		super();
		this.father = father;
		this.mother = mother;
		this.police = police;
		this.thief = thief;
		this.son1 = son1;
		this.son2 = son2;
		this.daughter1 = daughter1;
		this.daughter2 = daughter2;
		this.boat = boat;
	}
	public boolean isFather() {
		return father;
	}
	public void setFather(boolean father) {
		this.father = father;
	}
	public boolean isMother() {
		return mother;
	}
	public void setMother(boolean mother) {
		this.mother = mother;
	}
	public boolean isPolice() {
		return police;
	}
	public void setPolice(boolean police) {
		this.police = police;
	}
	public boolean isThief() {
		return thief;
	}
	public void setThief(boolean thief) {
		this.thief = thief;
	}
	public boolean isSon1() {
		return son1;
	}
	public void setSon1(boolean son1) {
		this.son1 = son1;
	}
	public boolean isSon2() {
		return son2;
	}
	public void setSon2(boolean son2) {
		this.son2 = son2;
	}
	public boolean isDaughter1() {
		return daughter1;
	}
	public void setDaughter1(boolean daughter1) {
		this.daughter1 = daughter1;
	}
	public boolean isDaughter2() {
		return daughter2;
	}
	public void setDaughter2(boolean daughter2) {
		this.daughter2 = daughter2;
	}
	public boolean isBoat() {
		return boat;
	}
	public void setBoat(boolean boat) {
		this.boat = boat;
	}
	

}
