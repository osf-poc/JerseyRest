
package osf.poc.jersey;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/configuration")
@Stateless
public class ConfigurationResource {
    @GET
    @Path("shit")
    @Produces("text/xml")
    public String shit() {
        return "Singy";
    }
    
    @GET
    @Path("smart")
    @Produces("text/xml")
    public String smart() {
        return "Wicht";
    }
}
