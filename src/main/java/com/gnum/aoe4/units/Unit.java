package com.gnum.aoe4.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gnum.aoe4.common.Cost;

public class Unit {
	
	private String name;
	private Cost cost;
	private double creationTime;
	
	public Unit(String name, Cost cost, double creationTime) {
		this.name = name;
		this.cost = cost;
		this.creationTime = creationTime;
	}
	
	public double getCostPerMinuteFood() {
		return Math.round(cost.getFood() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteWood() {
		return Math.round(cost.getWood() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteGold() {
		return Math.round(cost.getGold() / creationTime) * 60; // Get creation time in minutes
	}
	
	public double getCostPerMinuteStone() {
		return Math.round(cost.getStone() / creationTime) * 60; // Get creation time in minutes
	}

	@JsonProperty
	public String getName() {
		return name;
	}

	@JsonProperty
	public Cost getCost() {
		return cost;
	}

	@JsonProperty
	public double getCreationTime() {
		return creationTime;
	}
}
