package AbstractFactory;

import java.util.Calendar;

//�nica Fabrica com m�todos distintos dos produtos 
public abstract class EmpresaOnibus {
	
	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano( String origem, String destino, Calendar dataHoraPartida);
	
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual( String origem, String destino, Calendar dataHoraPartida);
	

}
