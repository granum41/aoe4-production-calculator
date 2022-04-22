package com.gnum.aoe4.units;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gnum.aoe4.common.Cost;
import com.gnum.aoe4.common.ResourceType;

public class AllUnitTypesRegistry {

	private static Set<Unit> allUnitTypes = new LinkedHashSet<Unit>();
	
	static {
		addUnitType("archer", new Cost(30,50,0,0), 15);
		addUnitType("crossbowman",  new Cost(80,0,40,0), 22);
		addUnitType("handcannoner", new Cost(120,0,120,0), 33);
		addUnitType("spearman",  new Cost(30,50,0,0), 15);
		addUnitType("menAtArms",  new Cost(100,0,20,0), 22);
		addUnitType("scout",  new Cost(70,0,0,0), 20);
		addUnitType("horseman",  new Cost(100,20,0,0), 22);
		addUnitType("knight",  new Cost(140,0,100,0), 35);
	}
	
	private static void addUnitType(String unitName, Cost cost, double creationTime) {
		allUnitTypes.add(new Unit(unitName, cost, creationTime));
		
	}

	public static Set<Unit> getAllUnits() {
		return allUnitTypes;
	}
	
}
