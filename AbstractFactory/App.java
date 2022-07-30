package AbstractFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class App {

	public static void main(String[] args) {

		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();
		
		//Emite passagens
		PassagemOnibusUrbano passagemUrbana = viacaoXYZ.emitePassagemOnibusUrbano("São Paulo", "Campinas", new GregorianCalendar(2022, Calendar.JULY, 24, 11, 0));
		PassagemOnibusInterestadual passagemInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("São Paulo", "Rio de Janeiro", new GregorianCalendar(2022, Calendar.AUGUST, 20, 8, 3));
				
		//Exibe detalhes da passagem
		passagemUrbana.exibeDetalhes();
		passagemInterestadual.exibeDetalhes();

	}

}
