package observer;

public class Main {

	public static void main(String[] args) {
		//Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		
		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		//Adicionar observador ao observado
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.para();
	}

}
