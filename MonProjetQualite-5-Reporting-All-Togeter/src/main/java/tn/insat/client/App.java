package tn.insat.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.dataaccess.IComptesDao;
import tn.insat.domain.Compte;


public class App 
{
   
	public static void main( String[] args )
    {
    	
	     // Get the factory
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	// Get the bean
    	IComptesDao dao = context.getBean("comptesDaoImplHibernate_ManagedTransactions",IComptesDao.class); 	
    	
    	//test_create(dao);
    	
    	test_findAll(dao);
    
    	// test_findById(dao);
    	//test_update(dao);
    	
    	//test_delete(dao);
    	
    	System.out.println("Fin du programme !");
    	
        context.close();
    
    }

	@SuppressWarnings("unused")
	private static void test_delete(IComptesDao dao) {
		
		boolean resultat = dao.delete("Z800");
		String message = resultat ? "Succes ": "Echec";
		System.out.println("Résultat du delete : "+ message);
		
	}

	@SuppressWarnings("unused")
	private static void test_update(IComptesDao dao) {
		try {
			dao.update(new Compte("Z800","Modified James Rumbaugh", new BigDecimal("1000")));
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Fin de l'update");
		
	}

	@SuppressWarnings("unused")
	private static void test_findById(IComptesDao dao) {
		
		Compte resultat = dao.findById("Z800");
		System.out.println(resultat);
		
		
	}

	private static void test_findAll(IComptesDao dao) {
		
		for (Compte un_compte : dao.findAll()) {
			System.out.println(un_compte);
		}
		
	}

	@SuppressWarnings("unused")
	private static void test_create(IComptesDao dao) {
		// Paly with the bean
    	dao.create(new Compte("Z800", "James Rumbaugh", new BigDecimal("9000")));
	}
}
