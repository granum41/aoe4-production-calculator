package com.gnum.aoe4.units;

import java.util.HashMap;
import java.util.Map;

import com.gnum.aoe4.common.ResourceType;

public abstract class Unit {
	
	private Map<ResourceType, Double> cost;
	protected int creationTime;
	
	public Unit() {
		cost = new HashMap<ResourceType, Double>();
	}
	
	public double getCostPerMinuteByResourceType(ResourceType type) {
		return (cost.get(type) / creationTime) * 60; // Get creation time in minutes
	}
	
	protected void setCost(ResourceType type, double cost) {
		this.cost.put(type, cost);
	}
	
}
