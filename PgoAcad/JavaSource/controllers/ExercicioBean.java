package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import dao.ExercicioDAO;
import models.Exercicio;
import models.GrupoMuscular;
import dao.GrupoMuscularDAO;

@Named
@SessionScoped
public class ExercicioBean implements Serializable {
	
	
	public ExercicioBean() {
		exercicio = new Exercicio();
		exercicios = new ArrayList<Exercicio>();
		grupos = new ArrayList<GrupoMuscular>();
	
	}
	
	private static final long serialVersionUID = -5655651570565345039L;
	private Exercicio exercicio;
	private List<Exercicio> exercicios;
	private List<GrupoMuscular> grupos;


	

	public List<GrupoMuscular> getGrupos() {
		grupos = GrupoMuscularDAO.listar();
		return grupos;
	}

	public void setGrupos(List<GrupoMuscular> grupos) {
		this.grupos = grupos;
	}


	public List<Exercicio> getExercicios() {
		exercicios = ExercicioDAO.listar();
		return exercicios;
	}
	
	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	
	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}



	public String cadastrar() {
		ExercicioDAO.cadastrar(exercicio);
		exercicio = new Exercicio();
		return "ListarExercicio.xhtml?faces-redirect=true";
	}

	public void remover(Exercicio exercicio) {
		ExercicioDAO.remover(exercicio);
	}
	
	public String detalhar() {
		int idExercicio = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idExercicio"));
		exercicio = ExercicioDAO.buscarPorId(idExercicio);
		return "AlterarExercicio.xhtml?faces-redirect=true";
	}
	
	public String alterar() {
		ExercicioDAO.alterar(exercicio);
		exercicio = new Exercicio();
		return "ListarExercicio.xhtml?faces-redirect=true";
	}

}
