package com.gnum.aoe4.units;

import com.gnum.aoe4.common.ResourceType;

public class Archer extends Unit {

	public Archer() {
		creationTime = 15;
		setCost(ResourceType.Food, 30);
		setCost(ResourceType.Wood, 50);
	}
	
}
