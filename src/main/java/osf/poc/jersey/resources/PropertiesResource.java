package osf.poc.jersey.resources;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import osf.poc.model.Property;
import osf.poc.services.PropertiesServiceLocal;

@Path("/properties")
@Stateless
public class PropertiesResource {
    
    @EJB
    private PropertiesServiceLocal service;
    
    public PropertiesResource(){
        super();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Property> getProperties() {
        return service.getProperties();
    }
    
    @GET
    @Path("/init")
    @Produces(MediaType.TEXT_PLAIN)
    public void initProperties() {
         service.init();
    }
}