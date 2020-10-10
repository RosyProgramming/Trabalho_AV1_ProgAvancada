package cadastrodefilmes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main (String [] args) throws ParseException {

		ArrayList<Cadastro> filme = new ArrayList<Cadastro>();
		
		 Cadastro filme1 = new Cadastro("A culpa das estrelas", "Romance","JOHN GREEN", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2012"));
		 Cadastro filme2 = new Cadastro("Antes que eu vá", "Drama,Suspense","Ry Ruso-Young", new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2017"));
		 Cadastro filme3 = new Cadastro("6 Dias", "Ação","Toa Fraser", new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2017"));
		 Cadastro filme4 = new Cadastro("TOMB RAIDER", "Ação","Alicia Vikander", new SimpleDateFormat("dd/MM/yyyy").parse("21/03/2019"));
		 
		 //inserir
		 filme.add(filme1);
		 filme.add(filme2);
		 filme.add(filme3);
		 filme.add(filme4);
		 
		 
		 //mostrar lista de filmes adicionado
		 System.out.println("Lista de filmes: ");
		 for (int i = 0; i < filme.size(); i++) {
			 System.out.println(filme.get(i));
		 }
		 
		 System.out.println("\n");
		 
		//excluir
		System.out.println("Removendo o ultimo filme da lista: ");
		filme.remove(filme4);
		for (int i = 0; i < filme.size(); i++) {
			 System.out.println(filme.get(i));
		 }
		
		System.out.println("Quantidade de filme na lista:");
		
		System.out.println(filme.size());

		
		 
		 System.out.println("\n");
		 
		 
		 //consultar
		 System.out.println("Consulta de filmes implementados:");
		 for (int i = 0; i < filme.size(); i++) {
			 Cadastro c = filme.get(i);
			 System.out.println(c.getTitulo());
		 }
			
	}
}
