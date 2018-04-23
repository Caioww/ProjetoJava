/**
 * @author Caio
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
	  /**
	   *Instanciando classe mundo para utilizar seus atributos e funções no Main 
	   */
		Mundo m = new Mundo();
		/**
		 * Gerar mundo com veiculos iniciais
		 * */
		m.geraVeiculos(); 
		m.desenhandoMundo(); 
		
		int i = 0;
		/**
		 *Laço de repetição para o mapa ser atualizado e os veiculos se moverem respeitando as condições da classe Mundo 
		 */ 
		while (i == 0) {
			m.mundoAtualizado(); 
			Thread.sleep(400);  
		}
	}
}
