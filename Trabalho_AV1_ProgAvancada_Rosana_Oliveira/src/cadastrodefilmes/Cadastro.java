package cadastrodefilmes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadastro {
	private String titulo;
	private String genero;
	private String Atores;
	private Date dataLancamento;
	

	public Cadastro(String titulo, String genero, String Atores, Date dataLancamento) {
		this.titulo = titulo;
		this.genero = genero;
		this.Atores = Atores;
		this.dataLancamento = dataLancamento;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getAtores() {
		return Atores;
	}


	public void setAtores(String atores) {
		Atores = atores;
	}


	public Date getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		return "Filme [titulo= " + titulo + ", genero = " + genero + ", dataLancamento = " + formatoData.format(dataLancamento) + ", Atores=" + Atores + "]";
	}
	
	
	
}