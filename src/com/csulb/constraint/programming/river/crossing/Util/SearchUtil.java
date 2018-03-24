package com.csulb.constraint.programming.river.crossing.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.csulb.constraint.programming.river.crossing.bo.Node;
import com.csulb.constraint.programming.river.crossing.bo.State;

public class SearchUtil {

	private List<Node> addToFrontier = new ArrayList<Node>();
	public static List<State> getPathFromRoot(Node nodeTemp) {
		List<State> path = new ArrayList<State>();
		Node current = nodeTemp;
		while (current.getParent()!=null) {
			path.add(0, current.getState());
			current = current.getParent();
		}
		path.add(0, current.getState());
		return path;
	}
}
