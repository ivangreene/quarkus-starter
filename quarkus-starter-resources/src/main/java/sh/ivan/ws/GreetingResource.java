package sh.ivan.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface GreetingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello();
}
