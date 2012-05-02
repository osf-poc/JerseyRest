package osf.poc.jersey.resources;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import osf.poc.jersey.model.Property;
import osf.poc.jersey.services.PropertiesService;

@Path("/properties")
@Stateless
public class PropertiesResource {
    @EJB
    private PropertiesService service;
    
    public PropertiesResource(){
        super();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Property> getProperties() {
        return service.getProperties();
    }
}