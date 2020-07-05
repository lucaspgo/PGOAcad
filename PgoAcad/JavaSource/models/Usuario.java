package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 7940692099650280961L;

	public Usuario() {

	}

	@Id
	@GeneratedValue
	private int id;
	private String cpf, senha, nome, sobrenome;
//	private AvaliacaoFisica avalicaoFisica;
//	private Treino treinos;
//	private Turma turmas;
//	private Chat chats;
	@ManyToOne
	private Modulo modulo;	
	
	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

//	public AvaliacaoFisica getAvalicaoFisica() {
//		return avalicaoFisica;
//	}
//
//	public void setAvalicaoFisica(AvaliacaoFisica avalicaoFisica) {
//		this.avalicaoFisica = avalicaoFisica;
//	}
//
//
//	public Treino getTreinos() {
//		return treinos;
//	}
//
//	public void setTreinos(Treino treinos) {
//		this.treinos = treinos;
//	}
//
//	public Turma getTurmas() {
//		return turmas;
//	}
//
//	public void setTurmas(Turma turmas) {
//		this.turmas = turmas;
//	}
//
//	public Chat getChats() {
//		return chats;
//	}
//
//	public void setChats(Chat chats) {
//		this.chats = chats;
//	}

}
