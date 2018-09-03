package tn.insat.dataaccess;

import java.util.List;

import tn.insat.domain.Compte;

public interface IComptesDao {
	
	void create(Compte c);
	Compte findById(String id);
	List<Compte> findAll();
	void update(Compte c);
	boolean delete (String id);

}
