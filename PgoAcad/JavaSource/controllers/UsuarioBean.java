package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import dao.ModuloDAO;
import dao.UsuarioDAO;
import models.Modulo;
import models.Usuario;

@Named
@SessionScoped
public class UsuarioBean implements Serializable {
	


	public UsuarioBean() {
		usuario = new Usuario();
		usuarios = new ArrayList<Usuario>();
		modulos = new ArrayList<Modulo>();
	
	}

	private static final long serialVersionUID = -6068414380480363992L;
	private Usuario usuario;
	private List<Usuario> usuarios;
	private List<Modulo> modulos;
 	
	public String cadastrar() {
		UsuarioDAO.cadastrar(usuario);
		usuario = new Usuario();
		return "ListagemUsuarios.xhtml?faces-redirect=true";		
	}
	
	public void remover(Usuario usuario) {
		UsuarioDAO.remover(usuario);	
	}
	
	public String detalhar() {
		int idUsuario = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idUsuario"));
		usuario = UsuarioDAO.buscarPorId(idUsuario);
		return "AlterarUsuario.xhtml?faces-redirect=true";
	}
	
	public String alterar() {
		UsuarioDAO.alterar(usuario);
		usuario = new Usuario();
		return "ListagemUsuarios.xhtml?faces-redirect=true";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		usuarios = UsuarioDAO.listar();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Modulo> getModulos() {
		modulos = ModuloDAO.listar();
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	
	
	

}
