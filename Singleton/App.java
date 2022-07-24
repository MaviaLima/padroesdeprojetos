package Singleton;
/**
 * 
 * @author mavia.ferreira.lima
 * Embora tente instanciar mais de uma janela o padr�o Sigleton retorna apenas uma �nica inst�ncia de Janela.
 *
 */
public class App {

	public static void main(String[] args) {
		Janela janela = Janela.getInstance();
		janela.pack();
		janela.setVisible(true);
		
		Janela janela2 = Janela.getInstance();
		janela2.pack();
		janela2.setVisible(true);
	}

}
