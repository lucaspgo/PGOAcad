package dao;

import java.util.List;
import javax.persistence.EntityManager;

import models.Usuario;
import utils.JPAUtils;

public class UsuarioDAO {

	public static void cadastrar(Usuario usuario) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}
	
	public static List<Usuario> listar() {
		EntityManager em = JPAUtils.getInstance();
		List<Usuario> usuarios = 
				em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
		return usuarios;
	}
	
	public static void remover(Usuario usuario) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(usuario));
		em.getTransaction().commit();
	}
	
	public static void alterar(Usuario usuario) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		
	}
	
	public static Usuario buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(Usuario.class, id);
	}
}
