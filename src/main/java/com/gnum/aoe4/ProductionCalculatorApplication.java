package com.gnum.aoe4;

import com.gnum.aoe4.api.ResourcesGatheredAPI;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class ProductionCalculatorApplication extends Application<ProductionCalculatorConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ProductionCalculatorApplication().run(args);
    }

    @Override
    public String getName() {
        return "aoe4-production-calculator";
    }

    @Override
    public void initialize(final Bootstrap<ProductionCalculatorConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ProductionCalculatorConfiguration configuration,
                    final Environment environment) {

    	final ResourcesGatheredAPI resource = new ResourcesGatheredAPI();
    	environment.jersey().register(resource);

    }

}
