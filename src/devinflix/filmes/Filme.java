package devinflix.filmes;

public class Filme extends Conteudo {

	private String url;
	
	public Filme(String titulo) {
		super();
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
