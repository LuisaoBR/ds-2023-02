package anotacao;

public class Motorista implements Observer {

	  @Override
	  public void notificar(Observable observable) {
	    if (observable instanceof Carro) {
	      System.out.println("Motorista percebendo que o carro está acelerando...");
	    }
	  }

	}
