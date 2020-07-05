package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import dao.GrupoMuscularDAO;
import dao.UsuarioDAO;
import dao.FichaDAO;
import models.FichaTreino;
import models.Usuario;
import models.GrupoMuscular;


@Named
@SessionScoped
public class FichaBean implements Serializable{
	

	public FichaBean() {
		fichaTreino = new FichaTreino();
		fichas = new ArrayList<FichaTreino>();
		usuarios= new ArrayList<Usuario>();
		grupos = new ArrayList<GrupoMuscular>();
		
	}
	private static final long serialVersionUID = 3152525643643719612L;
	private FichaTreino fichaTreino;
	private List<FichaTreino> fichas;
	private List<Usuario> usuarios;
	private List<GrupoMuscular> grupos;

	public String cadastrar() {
		FichaDAO.cadastrar(fichaTreino);
		fichaTreino = new FichaTreino();
		return "ListagemUsuarios.xhtml?faces-redirect=true";
	}
	
	public void remover (FichaTreino fichaTreino) {
		FichaDAO.remover(fichaTreino);
	}
	
	public String detalhar() {
		int idFicha = Integer.parseInt(
				FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idFicha"));
		fichaTreino = FichaDAO.buscarPorId(idFicha);
		return "AlterarFicha.xhtml?faces-redirect=true";
	}
	
	public String alterar() {
		FichaDAO.alterar(fichaTreino);
		fichaTreino = new FichaTreino();
		return "ListagemUsuarios.xhtml?faces-redirect=true";
	}

	public FichaTreino getFichaTreino() {
		return fichaTreino;
	}

	public void setFichaTreino(FichaTreino fichaTreino) {
		this.fichaTreino = fichaTreino;
	}

	public List<FichaTreino> getFichas() {
		fichas = FichaDAO.listar();
		return fichas;
	}

	public void setFichas(List<FichaTreino> fichas) {
		this.fichas = fichas;
	}

	public List<Usuario> getUsuarios() {
		usuarios = UsuarioDAO.listar();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<GrupoMuscular> getGrupos() {
		grupos = GrupoMuscularDAO.listar(); 
		return grupos;
	}

	public void setGrupos(List<GrupoMuscular> grupos) {
		this.grupos = grupos;
	}
	
	
	
	
	
	
	
	
	
	
}