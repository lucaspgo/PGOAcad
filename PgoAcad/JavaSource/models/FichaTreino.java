package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FichaTreino {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String semanaExercicio;
	private int numRepeticoes, peso, series;
	
	@ManyToOne
	private Usuario usuario;
	private GrupoMuscular grupoMuscular;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSemanaExercicio() {
		return semanaExercicio;
	}
	public void setSemanaExercicio(String semanaExercicio) {
		this.semanaExercicio = semanaExercicio;
	}
	public int getNumRepeticoes() {
		return numRepeticoes;
	}
	public void setNumRepeticoes(int numRepeticoes) {
		this.numRepeticoes = numRepeticoes;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}
	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}	
	
}	
	
	
	


