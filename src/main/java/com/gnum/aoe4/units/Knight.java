package com.gnum.aoe4.units;

import com.gnum.aoe4.common.ResourceType;

public class Knight extends Unit {

	public Knight() {
		creationTime = 35;
		setCost(ResourceType.Food, 140);
		setCost(ResourceType.Gold, 100);
	}
	
}
