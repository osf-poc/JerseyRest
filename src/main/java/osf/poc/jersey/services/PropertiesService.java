package osf.poc.jersey.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import osf.poc.jersey.model.Property;

@Stateless
public class PropertiesService {
    @PersistenceContext
    private EntityManager em;
        
    public List<Property> getProperties() {
        Query query = em.createQuery("Select p from Property p");
        
        return query.getResultList();
    }

    public void init() {
        for(int i = 0; i < 100; ++i){
            Property property = new Property();
            property.setName("count" + i);
            property.setText("" + i);
            
            em.persist(property);
        }
    }
}