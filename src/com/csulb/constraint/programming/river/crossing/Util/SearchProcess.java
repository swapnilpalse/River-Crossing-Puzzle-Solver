package com.csulb.constraint.programming.river.crossing.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.csulb.constraint.programming.river.crossing.bo.GoalState;
import com.csulb.constraint.programming.river.crossing.bo.Node;
import com.csulb.constraint.programming.river.crossing.bo.State;

public class SearchProcess {
	private Queue<Node> frontier = null;
	private Map<String,Integer> dataMap=new HashMap<String,Integer>();
	private Set<String> explored = new HashSet<String>();
	private Map<String, Node> frontierState = new HashMap<String, Node>();
	public Node popNodeFromQueue() {
		return frontier.pop();
	}
	public List<State> search(Node node, Queue<Node> frontier) {
		this.frontier = frontier;
		// initialize the frontier using the initial state of the problem
		Node root = node;
		if (GoalState.isGoalState(node.getState())) {
			return SearchUtil.getPathFromRoot(root);
		}

		frontier.insert(root);
		setQueueSize(frontier);
		while (!(frontier.isEmpty())) {
			Node nodeToExpand = popNodeFromQueue();
			explored.add(nodeToExpand.getState().getState());
			setQueueSize(frontier);
			if (GoalState.isGoalState(nodeToExpand.getState())) {
				return SearchUtil.getPathFromRoot(nodeToExpand);
			}
			// expand the chosen node, adding the resulting nodes to the
			// frontier
			
			Node fn=null;
			List<Node> tempState=new ArrayList<Node>();
			for (State state : GetNextStates.states(nodeToExpand.getState())) {
				fn=new Node();
				fn.setState(state);
				fn.setParent(nodeToExpand);
				fn.setHeuristicValue();
					if (GoalState.isGoalState(fn.getState())) {
						return SearchUtil.getPathFromRoot(fn);
					}
//					if(!explored.contains(fn.getState().getState())){
//						
//						frontier.insert(fn);
//					}
					if(tempState.isEmpty()){
						tempState.add(fn);
					}
					else{
						List<Node> tempList1=new ArrayList<Node>(tempState);
						boolean f=false;
						for(int i=0;i<tempState.size();i++){
							if(fn.getHeuristicValue()<=tempState.get(i).getHeuristicValue()){
								tempList1.add(i, fn);
								f=true;
								break;
							}
						}
						if(!f){
							tempList1.add(fn);
						}
						tempState=tempList1;
					}
				}
			for(Node nodeTemp:tempState){
				if(!explored.contains(nodeTemp.getState().getState())){
					frontier.insert(nodeTemp);					
				}
		}
			setQueueSize(frontier);
			}
			return Collections.emptyList();
		}
		// if the frontier is empty then return failure

	
	public void setQueueSize(Queue<Node> queue) {
		dataMap.put("queueSize", queue.size());
	}
}
