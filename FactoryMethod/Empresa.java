package FactoryMethod;

import java.util.Calendar;

//Fábrica abstrata
public abstract class Empresa {

	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
}
