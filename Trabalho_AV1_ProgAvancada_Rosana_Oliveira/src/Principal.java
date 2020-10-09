import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main (String [] args) throws ParseException {
		
		 Filme filme1 = new Filme("A culpa das estrelas", "Romance","JOHN GREEN", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2012"));
		 
		 System.out.println(filme1);
		
	}
}
