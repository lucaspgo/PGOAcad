package models;

import java.io.Serializable;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

@Entity
public class GrupoMuscular implements Serializable {
	
	private static final long serialVersionUID = -3182093484527654637L;
	@Id
	@GeneratedValue
	private int id;
	private String nome;
//	@OneToMany
//	private List<Exercicio> exercicios;

	

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoMuscular other = (GrupoMuscular) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	

}
	

