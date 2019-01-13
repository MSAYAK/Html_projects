package java.dao;

 
 

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public class RegistrationDaoImpl implements RegistrationDao{
	
	
	private SessionFactory sessionFactory;
	public RegistrationDaoImpl() {
		
	}
	
	public RegistrationDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	

	 

	@Override
	public void save(pozo.Registration r) {
		sessionFactory.getCurrentSession().save(r);
		
	}

	 

}
