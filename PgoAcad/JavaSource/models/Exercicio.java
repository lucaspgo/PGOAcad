package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exercicio {
	
	public Exercicio() {
		grupoMuscular = new GrupoMuscular();
	}

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private int numRepeticoes, peso, series;
	@ManyToOne
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



	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}
	
	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}
}	