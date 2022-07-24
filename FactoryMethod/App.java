package FactoryMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {
		//Empresas de ônibus
		Empresa viacaoABCLocal = new EmpresaOnibusUrbano();
		Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();
		
		//Emite passagen
		Passagem passagemUrbana = viacaoABCLocal.emitePassagem("São Paulo", "Campinas", new GregorianCalendar(2022, Calendar.JULY, 24, 11, 0));
		Passagem passagemInterestadual = viacaoXYZInter.emitePassagem("São Paulo", "Rio de Janeiro", new GregorianCalendar(2022, Calendar.AUGUST, 20, 8, 3));
		
		//Exibe detalhes da passagem
		passagemUrbana.exibeDetalhes();
		passagemInterestadual.exibeDetalhes();

	}

}
