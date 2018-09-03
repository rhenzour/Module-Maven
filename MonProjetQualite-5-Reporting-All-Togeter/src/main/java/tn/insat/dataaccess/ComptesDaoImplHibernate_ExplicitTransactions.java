package tn.insat.dataaccess;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import tn.insat.domain.Compte;

@Repository
public class ComptesDaoImplHibernate_ExplicitTransactions implements IComptesDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Compte c) {
		
		Session session =  sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();		
		
		session.save(c);
		
		transaction.commit();
		
		session.close();

	}

	@Override
	public Compte findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
