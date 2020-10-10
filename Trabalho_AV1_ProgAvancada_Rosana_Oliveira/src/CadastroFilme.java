import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CadastroFilme extends Principal{
	
	private static String titulo;
	private static String genero;
	private static String Atores;
	private static Date dataLancamento;
	private static ArrayList<Filme> Filme;
	private ArrayList<Principal> Principal;
	
	
	public CadastroFilme(String titulo) {
		super();
		this.titulo = titulo;
		this.Filme = new ArrayList<Filme>();
		this.Principal = new ArrayList<Principal>();
	}
	
	public static void CadastraFilme(Filme F) {
		Filme.add(F);
	}

	public void excluiFilme(Filme F) {
		Filme.remove(F);
	}

	public static void listaFilme() {
		for (Filme F: Filme) {
			System.out.println(F.toString());
		};
	}
	
}
