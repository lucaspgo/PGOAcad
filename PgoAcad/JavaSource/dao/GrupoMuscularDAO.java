package dao;

import java.util.List;

import javax.persistence.EntityManager;

//import models.Exercicio;
import models.GrupoMuscular;
import utils.JPAUtils;

public class GrupoMuscularDAO {
	
	public static List<GrupoMuscular> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<GrupoMuscular> grupos = 
				em.createQuery("SELECT gm FROM GrupoMuscular gm", GrupoMuscular.class).getResultList();
		return grupos;
	}

	public static GrupoMuscular buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(GrupoMuscular.class, id);
	}
}
