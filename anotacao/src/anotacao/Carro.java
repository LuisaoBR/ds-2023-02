package anotacao;

import java.util.List;
import java.util.ArrayList;

public class Carro implements Observable {

	  private String identificador;

	  private List<Observer> observadores;

	  public Carro(String identificador) {
	    this.identificador = identificador;
	    this.observadores = new ArrayList<>();
	  }

	  @Override
	  public void addObserver(Observer observer) {
	    if (observer.observado().equals(this.identificador)) {
	      this.observadores.add(observer);
	    }
	  }

	  @Override
	  public void removeObserver(Observer observer) {
	    this.observadores.remove(observer);
	  }

	  @Override
	  public void notifyObservers() {
	    this.observadores.forEach(observer -> observer.notificar(this));
	  }

	  public void acelerar() {
	    System.out.println("Carro acelerando...");
	    this.notifyObservers();
	  }

	}
