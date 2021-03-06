package devinflix.filmes;

import java.time.LocalDate;

public class Conteudo {

	protected String titulo;
	protected Genero genero;
	protected LocalDate anoLancamento;
	protected String sinopse;
	protected int curtidas; 
	protected int descurtidas;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public int getDescurtidas() {
		return descurtidas;
	}
	public void setDescurtidas(int descurtidas) {
		this.descurtidas = descurtidas;
	}
}
