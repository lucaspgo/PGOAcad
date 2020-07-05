package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Modulo;
import utils.JPAUtils;


public class ModuloDAO {
	
	public static List<Modulo> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Modulo> modulos = 
				em.createQuery("SELECT m FROM Modulo m", Modulo.class).getResultList();
		return modulos;
	}
	
	public static Modulo buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(Modulo.class, id);
	}
}


