package co.brais.jaxrs;

import co.brais.jaxrs.controller.CalculatorController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(CalculatorController.class);
    }
}