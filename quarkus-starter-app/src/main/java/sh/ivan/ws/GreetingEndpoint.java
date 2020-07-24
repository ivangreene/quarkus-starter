package sh.ivan.ws;

import javax.ws.rs.Path;

@Path("/greeting")
public class GreetingEndpoint implements GreetingResource {

    @Override
    public String hello() {
        return "hello";
    }
}
