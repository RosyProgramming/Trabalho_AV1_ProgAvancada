import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme extends CadastroFilme{
	
	private String titulo;
	private String genero;
	private static String Atores;
	private static Date dataLancamento;
	public static String[] getAtores;
	
	
	public void setAtores(String Atores) {
		this.Atores = Atores;
	}
	
	public static String[] getGetAtores() {
		return getAtores;
	}


	public Filme(String titulo, String genero,String Atores, Date dataLancamento) {
		super(Atores);
		this.titulo = titulo;
		this.genero = genero;
		this.Atores = Atores;
		this.dataLancamento = dataLancamento;
	}
		

	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		return "Filme [titulo= " + titulo + ", genero = " + genero + ", dataLancamento = " + formatoData.format(dataLancamento) + ", Atores=" + Atores + "]";
	}

}

