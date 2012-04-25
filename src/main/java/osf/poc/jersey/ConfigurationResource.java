package osf.poc.jersey;

import javax.ws.rs.core.MediaType;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/configuration")
@Stateless
public class ConfigurationResource {
    @GET
    @Path("conf1")
    @Produces(MediaType.TEXT_PLAIN)
    public String config1() {
        return "Config1";
    }
    
    @GET
    @Path("conf2")
    @Produces(MediaType.TEXT_PLAIN)
    public String config2() {
        return "Config2";
    }
}
