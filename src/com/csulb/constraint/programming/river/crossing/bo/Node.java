package com.csulb.constraint.programming.river.crossing.bo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Node {
private Node parent;
private State state;
private int heuristicValue;

public int getHeuristicValue() {
	return heuristicValue;
}
public void setHeuristicValue() {
	int s=0;
	if(state!=null && (state.getState()!=null || !state.getState().equals("") )){
		s=StringUtils.countMatches(state.getState(), "true");
	}
	this.heuristicValue = s;
}
public Node getParent() {
	return parent;
}
public void setParent(Node parent) {
	this.parent = parent;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}


}
