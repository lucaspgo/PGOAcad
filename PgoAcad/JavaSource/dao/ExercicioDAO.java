package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Exercicio;
import utils.JPAUtils;

public class ExercicioDAO {
	
	public static void cadastrar(Exercicio exercicio) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(exercicio);
		em.getTransaction().commit();
	}
	
	public static List<Exercicio> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Exercicio> exercicios = 
				em.createQuery("SELECT e FROM Exercicio e", Exercicio.class).getResultList();
		return exercicios;		
	}
	
	public static void remover(Exercicio exercicio) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(exercicio));
		em.getTransaction().commit();
	}
	
	public static void alterar(Exercicio exercicio) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.merge(exercicio);
		em.getTransaction().commit();
		
	}
	
	public static Exercicio buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(Exercicio.class, id);
	}
}
