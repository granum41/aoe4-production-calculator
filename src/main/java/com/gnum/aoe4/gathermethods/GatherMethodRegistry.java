package com.gnum.aoe4.gathermethods;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gnum.aoe4.common.ResourceType;

public class GatherMethodRegistry {

	private static Set<GatherMethod> allGatherMethods = new LinkedHashSet<GatherMethod>();
	
	static {
		addGatherMethod("Deer", ResourceType.Food, 11/10);
		addGatherMethod("Sheep", ResourceType.Food, 20);
	}
	
	private static void addGatherMethod(String methodName, ResourceType type, double rate) {
		allGatherMethods.add(new GatherMethod(methodName, type, rate));
	}

	public static Set<GatherMethod> getAllGatherMethods() {
		return allGatherMethods;
	}
	
}
