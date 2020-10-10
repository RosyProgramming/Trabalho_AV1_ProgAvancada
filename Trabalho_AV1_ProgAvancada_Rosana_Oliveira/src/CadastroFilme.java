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
		CadastroFilme.setTitulo(titulo);
		CadastroFilme.setFilme(new ArrayList<Filme>());
		this.setPrincipal(new ArrayList<Principal>());
	}
	
	public static void CadastraFilme(Filme F) {
		getFilme().add(F);
	}

	public void excluiFilme(Filme F) {
		getFilme().remove(F);
	}

	public static void listaFilme() {
		for (Filme F: getFilme()) {
			System.out.println(F.toString());
		};
	}

	public static String getTitulo() {
		return titulo;
	}

	public static void setTitulo(String titulo) {
		CadastroFilme.titulo = titulo;
	}

	public static String getGenero() {
		return genero;
	}

	public static void setGenero(String genero) {
		CadastroFilme.genero = genero;
	}

	public static String getAtores() {
		return Atores;
	}

	public static void setAtores(String atores) {
		Atores = atores;
	}

	public static Date getDataLancamento() {
		return dataLancamento;
	}

	public static void setDataLancamento(Date dataLancamento) {
		CadastroFilme.dataLancamento = dataLancamento;
	}

	public ArrayList<Principal> getPrincipal() {
		return Principal;
	}

	public void setPrincipal(ArrayList<Principal> principal) {
		Principal = principal;
	}

	public static ArrayList<Filme> getFilme() {
		return Filme;
	}

	public static void setFilme(ArrayList<Filme> filme) {
		Filme = filme;
	}
	
}
