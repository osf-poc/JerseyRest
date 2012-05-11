package osf.poc.services;

import java.util.List;
import javax.ejb.Local;
import osf.poc.model.Property;

/**
 * Interface representing an abstract config properties service
 */
@Local
public interface PropertiesServiceLocal {
    
    public void init();
    
    public List<Property> getProperties();

}