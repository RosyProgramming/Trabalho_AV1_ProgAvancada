import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main (String [] args) throws ParseException {
		
		 Filme filme1 = new Filme("A culpa das estrelas", "Romance","JOHN GREEN", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2012"));
		 Filme filme2 = new Filme("Antes que eu vá", "Drama,Suspense","Ry Ruso-Young", new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2017"));
		 Filme filme3 = new Filme("6 Dias", "Ação","Toa Fraser", new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2017"));
		 Filme filme4 = new Filme("TOMB RAIDER", "Ação","Alicia Vikander", new SimpleDateFormat("dd/MM/yyyy").parse("21/03/2019"));
		 
		 /*
		 System.out.println(filme1);
		 System.out.println(filme2);
		 System.out.println(filme3);
		 System.out.println(filme4);
		 */
			Filme.CadastraFilme(filme1);
			Filme.CadastraFilme(filme2);
			Filme.CadastraFilme(filme3);
			Filme.CadastraFilme(filme4);
			
			Filme.listaFilme();
		
	}
}
