package AbstractFactory;

import java.util.Calendar;

//Única Fabrica com métodos distintos dos produtos 
public abstract class EmpresaOnibus {
	
	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano( String origem, String destino, Calendar dataHoraPartida);
	
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual( String origem, String destino, Calendar dataHoraPartida);
	

}
