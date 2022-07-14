package Cinema;

public class Ingresso {
	private int data; 
	private String filme;
	private int sala;
	private double horario;
	private double valorIngresso;

	public Ingresso(int data, String filme, int sala, double horario, double valorIngresso) {
		this.setData(data);
		this.setFilme(filme);
		this.setHorario(horario);
		this.setSala(sala);
		this.valorIngresso = valorIngresso;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	@Override
	public String toString() {
		return "Ingresso [data=" + data + ", filme=" + filme + ", sala=" + sala + ", horario=" + horario
				+ ", valorIngresso=" + valorIngresso + "]";
	}
}
