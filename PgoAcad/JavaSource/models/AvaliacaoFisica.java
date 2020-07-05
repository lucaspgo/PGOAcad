package models;

public class AvaliacaoFisica {

	private int id;
	private Double massa, massaMagra, MassaGordura;
	private Usuario medico;
	private String data;
	private Boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public Double getMassaMagra() {
		return massaMagra;
	}

	public void setMassaMagra(Double massaMagra) {
		this.massaMagra = massaMagra;
	}

	public Double getMassaGordura() {
		return MassaGordura;
	}

	public void setMassaGordura(Double massaGordura) {
		MassaGordura = massaGordura;
	}

	public Usuario getMedico() {
		return medico;
	}

	public void setMedico(Usuario medico) {
		this.medico = medico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
