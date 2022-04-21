package com.gnum.aoe4.units;

import com.gnum.aoe4.common.ResourceType;

public class Spearman extends Unit {

	public Spearman() {
		creationTime = 15;
		setCost(ResourceType.Food, 60);
		setCost(ResourceType.Wood, 20);
	}
	
}
