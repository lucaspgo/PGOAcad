package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.FichaTreino;
import utils.JPAUtils;


public class FichaDAO {
	
	public static void cadastrar(FichaTreino fichaTreino) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(fichaTreino);
		em.getTransaction().commit();
	}
	
	public static List<FichaTreino> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<FichaTreino> fichas = 
				em.createQuery("SELECT ft FROM FichaTreino ft", FichaTreino.class).getResultList();
		return fichas;
	}
	
	public static void remover(FichaTreino fichaTreino) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(fichaTreino));
		em.getTransaction().commit();
	}
	
	public static void alterar(FichaTreino fichaTreino) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.merge(fichaTreino);
		em.getTransaction().commit();
	}
	
	public static FichaTreino buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(FichaTreino.class, id);
	}


}
