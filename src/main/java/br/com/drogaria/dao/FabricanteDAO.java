package br.com.drogaria.dao;

import javax.persistence.EntityManager;

import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.factory.ConectionFactory;

public class FabricanteDAO {

	public void salvar(Fabricante entidade) {
		EntityManager em = ConectionFactory.getEM();
		em.getTransaction().begin();
		
		try {
			em.persist(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	}
	
	public static void main(String[] args) {
		Fabricante entidade = new Fabricante();
		
		entidade.setDescricao("Alef Ojeda de Oliveira");
		
		FabricanteDAO dao = new FabricanteDAO();
		
		dao.salvar(entidade);
	}
}
