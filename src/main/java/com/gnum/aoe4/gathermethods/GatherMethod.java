package com.gnum.aoe4.gathermethods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gnum.aoe4.common.ResourceType;

public class GatherMethod {
	private String name;
	private ResourceType type;
	private double gatherRate;

	public GatherMethod(String name, ResourceType type, double rate) {
		this.name = name;
		this.type = type;
		this.gatherRate = rate;
	}
	
	@JsonProperty
	public String getName() {
		return name;
	}
	
    @JsonProperty
	public ResourceType getType() {
		return type;
	}
	
    @JsonProperty
	public double getGatherRate() {
		return gatherRate;
	}
	
}
