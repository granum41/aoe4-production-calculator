package com.gnum.aoe4.api;

import java.util.Set;

import com.gnum.aoe4.gathermethods.GatherMethod;
import com.gnum.aoe4.gathermethods.GatherMethodRegistry;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/gatherMethods")
@Produces(MediaType.APPLICATION_JSON)
public class ResourcesGatheredAPI {

    @GET
    public Set<GatherMethod> getGatherTemplate() {
    	return GatherMethodRegistry.getAllGatherMethods();
    }
    
}
