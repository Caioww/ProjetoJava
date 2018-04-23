
/**
 * 
 * Classe que gera um veículo do tipo Carro
 * 
 * @author Caio
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Veiculo {
	
	Random aleatorio = new Random(); /// Função random, utilizada para gerar posições aleatórias
	
	/**
	 * Construtor da classe Veículo
	 * Incializa as váriaveis de veículo
	 */
	public Veiculo() {
	     	x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 
	}
	
	/**
	 * Construtor da classe Veículo
	 * Cria veículos com variáveis que são recebidas na chamada das funções de cada veículo específico
	 * 
	 * @param x 
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Veiculo(int x, int y, int velocidade, String cor, boolean fabrica) {
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
		this.fabrica = fabrica;
	}
	
	/**
	 * Cria um valor aleatório para o X do veículo
	 * 
	 * @return O valor aleatório gerado para X
	 */
	public int setX() {
		x = r.nextInt(28);
		return x;
		
	}
	
	/**
	 * Altera o valor de X de um veículo com base no que será passado dentro de cada veículo específico
	 * 
	 * @param x
	 */
	public void andaX(int x) {
		this.x = x;
	}
	
	/**
	 * Altera o valor de Y de um veículo com base no que será passado dentro de cada veículo específico
	 * 
	 * @param y
	 */
	public void andaY(int y) {
		this.y = y;
	}
	
	/**
	 * Cria um valor aleatório para o Y do veículo
	 * 
	 * @return O valor aleatório gerado para Y
	 */
	public int setY() {
		y = r.nextInt(58);
		return y;
	}
	
	/**
	 * @return O valor de X do veículo
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return O valor de Y do veículo
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @return A velocidade do veículo
	 */
	public int getVelocidade() {
		return velocidade;
	}
	
	/**
	 * @return A cor do veículo
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Verifica se um veiculo esta ou não em uma fabrica dependendo do que é recebido no status
	 * 
	 * @param status 
	 */
	public void setFabrica(boolean status) {
		fabrica = status;
	}
	
	/**
	 * @return Se um veículo está ou não em uma fábrica
	 */
	public boolean getFabrica() {
		return fabrica;
	}
	
	private int x; /// Coordenada X do veículo
	private int y; /// Coordenada Y do veículo
	private int velocidade; /// Variavel para velocidade
	private boolean fabrica; /// Variavel boolean para verificar se o veiculo está ou não em uma fabrica
	private String cor; /// Cor do veículo
}
}
