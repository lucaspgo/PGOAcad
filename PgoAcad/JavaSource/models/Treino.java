package models;

public class Treino {

	private int id;
	private FichaTreino execicios;
	private Usuario professor;
	private Modalidade modelidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FichaTreino getExecicios() {
		return execicios;
	}

	public void setExecicios(FichaTreino execicios) {
		this.execicios = execicios;
	}

	public Usuario getProfessor() {
		return professor;
	}

	public void setProfessor(Usuario professor) {
		this.professor = professor;
	}

	public Modalidade getModelidade() {
		return modelidade;
	}

	public void setModelidade(Modalidade modelidade) {
		this.modelidade = modelidade;
	}

}
