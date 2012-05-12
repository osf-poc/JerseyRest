package osf.poc.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import osf.poc.model.Property;

/**
 * Represent the service to get configuration properties
 */
@Stateless
public class PropertiesService implements PropertiesServiceLocal {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void init() {
        for(int i = 0; i < 100; ++i) {
            Property property = new Property();
            property.setName("count" + i);
            property.setValue("" + i);
            
            em.persist(property);
        }
    }
        
    @Override
    public List<Property> getProperties() {
        Query query = em.createQuery("Select p from Property p");
        
        return query.getResultList();
    }
}