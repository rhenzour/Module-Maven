package tn.insat.dataaccess;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.insat.domain.Compte;

@Repository
// Effect of @Repository : Mark the class as A Spring Bean + perform EXCEPTION TRANSLATION
@Transactional(readOnly = true)
public class ComptesDaoImplHibernate_ManagedTransactions implements IComptesDao {

	@Autowired
	@Qualifier("sessionFactory_hibernate")
	private SessionFactory sessionFactory;

	@Override
	@Transactional(readOnly = false)
	public void create(Compte c) {

		Session session = sessionFactory.getCurrentSession();
		session.save(c);
	}

	@Override
	public Compte findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return (Compte) session.get(Compte.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Compte>) session.createQuery("from Compte").list();
	}

	@Override
	@Transactional(readOnly = false)
	public void update(Compte c) {
		Session session = sessionFactory.getCurrentSession();
		session.update(c);
	}

	@Override
	@Transactional(readOnly = false)
	public boolean delete(String id) {
		boolean retour = false;
		Session session = sessionFactory.getCurrentSession();
		Compte a_supprimer = (Compte) session.get(Compte.class, id);
		if (a_supprimer != null) {
			session.delete(a_supprimer);
			retour = true;  // Successfully deleted object !
		}
		return retour;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
