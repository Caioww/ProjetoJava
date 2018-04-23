/**
 * 
 * Classe que gera um veículo do tipo Moto
 * 
 * @author Caio
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Moto extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Moto, que usa um Super para chamar o construtor da classe Veículo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	
	public Moto (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	/**
	 * Random importado no inicio da classe para gerar numeros aleatórios utilizados para movimentar os veiculos
	 */
	Random aleatorio = new Random();
	
	/**
	 * Função que movimenta a moto, recebendo um objeto da própria classe como parâmetro
	 * @param m
	 */
	public void mover(Moto mot) {
		mover = aleatorio.nextInt(4); /// Gerando um número aleatório para movimentação do veículo em 4 direções
		
		
		/**
		 * Verificação do Numero aleatório gerado ,para ver se entra nas condições dos ifs.
		 */
		if(mover == 0) {
			int x = mot.getX();
			x = x + 3;
			mot.andaX(verificaX(x));
		}
		
		if(mover == 1) {
			int x = moto.getX();
			x = x - 3;
			moto.andaX(verificaX(x));
		}
		
		if(mover == 2) {
			int y = moto.getY();
			y = y + 3;
			moto.andaY(verificaY(y));
		}
		
		if(mov == 3) {
			int y = m.getY();
			y = y - 3;
			moto.andaY(verificaY(y));
		}
	
	}
	

	/**
	 * Função para verificar se a moto chegou ao limite do mapa(Matriz) em X e reseta a coordenada para a posição inicial
	 * @param x
	 * @return
	 */
	public int verificaX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	
	/**
	 * Função para verificar se a moto chegou ao limite do mapa(Matriz) em Y e reseta a coordenada para a posição inicial
	 * @param y
	 * @return
	 */
	public int verificaY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}
	
	private int mover; /// Variável para movimentar a moto
	

}
