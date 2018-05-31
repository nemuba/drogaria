package br.com.drogaria.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {
	
	public static EntityManager getEM(){
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			 emf = Persistence.createEntityManagerFactory("DrogariaPU");
			 em = emf.createEntityManager();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return em;
	}
}
