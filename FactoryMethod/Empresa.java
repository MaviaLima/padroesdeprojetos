package FactoryMethod;

import java.util.Calendar;

//F�brica abstrata
public abstract class Empresa {

	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
}
