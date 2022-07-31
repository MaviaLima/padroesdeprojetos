package Builder;
/*
 * Os m�todos ficam totalmente incapsulados dentro da classe Builder o processo de produ��o
 * Ideal quando se tem etapas complexas de constru��o para um produto final
 * 
 */
public class App {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		
		//Builders
		SanduicheBuilder builder1 = new HamburgerBuilder();
		SanduicheBuilder builder2 = new FishBuilder();
		
		cozinha.fazSanduiche(builder1);
		builder1.getSanduiche();
		
		cozinha.fazSanduiche(builder2);
		builder2.getSanduiche();
	}

}
