package osf.poc.jersey.services;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import osf.poc.jersey.model.Property;

@Stateless
public class PropertiesService {
    private List<Property> properties = new ArrayList<Property>();
    
    public PropertiesService(){
        super();
        
        for(int i = 0; i < 1000; ++i){
            properties.add(new Property("count" + i, "" + i));
        }
    }
    
    public List<Property> getProperties() {
        return new ArrayList<Property>(this.properties);
    }
}