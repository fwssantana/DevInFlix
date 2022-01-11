package devinflix;

import devinflix.filmes.Filme;
import devinflix.usuarios.Usuario;

public class Plataforma {

	public void curtirDescurtirFilme(Filme filme, 
			Usuario usuario, boolean curtir) {
		if (curtir) {
			filme.setCurtidas(filme.getCurtidas() + 1);
		} else {
			filme.setDescurtidas(filme.getDescurtidas() + 1);
		}
	}
	
	public void selecionaFilme(Filme filme, Usuario usuario) {
		// Usuário seleciona e assite um filme;
	}
		
	public static void main(String[] args) {
		Plataforma devinflix = new Plataforma();
		
		Usuario u = new Usuario();
		u.setNome("Francisco");
		
		Filme f1 = new Filme("Homem Aranha");
		Filme f2 = new Filme("Não olhe pra cima");
		Filme f3 = new Filme("Tik Tik Boom");
		Filme f4 = new Filme("Zorro");
		
		devinflix.selecionaFilme(f1, u);
		devinflix.curtirDescurtirFilme(f1, u, true);
	}
	
}
