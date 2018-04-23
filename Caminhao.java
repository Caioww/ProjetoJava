import java.util.Random;

/**
 * Classe que gera um veículo do tipo Caminhão
 * 
 * @author Caio
 * 
 * @see Veiculo
 */

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Caminhão, que usa o super pra chamar o construtor da classe Veiculo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Caminhao (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	/**
	 * Random declarado no import usado para gerar numeros aleatórios
	 */
	Random aleatorio = new Random();
	
	/**
	 * Função para movimentar o caminhão para posições aleatórias na Matriz , recebendo um objeto da própria classe como parâmetro.
	 * @param d
	 */
	public void move(Caminhao cam) {
		mover = aleatorio.nextInt(4); /// < Gerar posição aleatória , sendo cada numero é equivalente a uma direção de 0 á 3.
		
		/**
		 * Verificação do random para movimentar o caminhão ,com a utilização de getters
		 */
		if(mover == 0) {//<If para verificar se a posição que ira se movimentar tem valor igual a 0, caso não irá cair nas outras condições.
			int x = cam.getX();
			x = x + 1;
			cam.andaX(verificaX(x));
		}
		
		if(mover == 1) {
			int x = cam.getX();
			x = x - 1;
			cam.andaX(verificaX(x));
		}
		
		if(mover == 2) {
			int y = d.getY();
			y = y + 1;
			cam.andaY(verificaY(y));
		}
		
		if(mover == 3) {
			int y = cam.getY();
			y = y - 1;
			cam.andaY(verificaY(y));
		}
	
	}

	/**
	 * Função para verificar se ao caminhão chegou ao limite do mapa em X e reseta a posição para a linha ou coluna inicial dependendo de qual eixo foi movimentado , nesse caso o eixo X.
	 * 
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
	 * Função para verificar se o caminhão chegou ao limite do mapa em Y e reseta a coordenada , nesse caso em relação as colunas
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
	
	private int mover; /// Variável para movimentar o caminhão 

}
