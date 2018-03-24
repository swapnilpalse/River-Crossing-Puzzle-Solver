package com.csulb.constraint.programming.river.crossing.bo;

public class GoalState {
	private final static String goalState = "true," + "" + "true," + "" + "true," + "" + "true," + "" + "true," + ""
			+ "true," + "" + "true," + "" + "true," + "" + "true" + "";

	public static boolean isGoalState(State state) {
		return state.isBoat() && state.isDaughter1() && state.isDaughter2() && state.isFather() && state.isMother() && state.isSon2() && state.isSon1() && state.isPolice() && state.isThief();
	}
}
