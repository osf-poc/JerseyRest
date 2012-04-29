package osf.poc.jersey.resources;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import osf.poc.jersey.model.Property;

@Path("/properties")
@Stateless
public class PropertiesResource {
    private List<Property> properties = new ArrayList<Property>();
    
    public PropertiesResource(){
        super();
        
        properties.add(new Property("count", "4"));
        properties.add(new Property("name", "Baptiste Wicht"));
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Property> getProperties() {
        return new ArrayList<Property>(this.properties);
    }
}