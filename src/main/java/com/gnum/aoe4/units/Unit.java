package com.gnum.aoe4.units;

import java.util.HashMap;
import java.util.Map;

import com.gnum.aoe4.common.Cost;
import com.gnum.aoe4.common.ResourceType;

public class Unit {
	
	private String name;
	private Cost cost;
	private double creationTime;
	
	public Unit(String name, Cost cost,double creationTime) {
		this.name = name;
		this.cost = cost;
		this.creationTime = creationTime;
		
	}
	
	public double getCostPerMinuteFood() {
		return (cost.getFood() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteWood() {
		return (cost.getWood() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteGold() {
		return (cost.getGold() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteStone() {
		return (cost.getStone() / creationTime) * 60; // Get creation time in minutes
	}
	
	
	
}
