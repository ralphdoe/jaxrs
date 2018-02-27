package co.brais.jaxrs.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculator")
public class CalculatorController {

    @GET
    @Path("/sum")
    public int sum(){
        return 10;
    }
}
