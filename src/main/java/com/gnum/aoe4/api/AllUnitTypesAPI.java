package com.gnum.aoe4.api;

import java.util.Set;

import com.gnum.aoe4.units.AllUnitTypesRegistry;
import com.gnum.aoe4.units.Unit;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/units")
@Produces(MediaType.APPLICATION_JSON)
public class AllUnitTypesAPI {

    @GET
    public Set<Unit> getUnitTypeTemplate() {
    	return AllUnitTypesRegistry.getAllUnits();
    }
    
}
