import java.util.ArrayList;

public class Mundo {
	/**
	 * Instanciando a classe veículo para utilização de atributos da Classe no Mundo
	 */
	Veiculo v = new Veiculo();
	/**
	 * Gerando ArrayList de cada um dos veículos:Carros,Caminhão,Moto
	 */
	ArrayList <Carro> car = new ArrayList<>();
	ArrayList <Caminhao> cam = new ArrayList<>();
	ArrayList <Moto> mot = new ArrayList<>();
/**
*Criação do Mundo(Matriz) de 30 linhas e 60 colunas
*/
	public int mundo[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	
	/**
	 * Função que gera 10 de cada veiculo em posições aleatórias
	 */
	public void geraVeiculos() {
		for(int i = 0; i < 10; i++) {
			car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
			while (mundo[car.get(i).getX()][car.get(i).getY()] == 2) { /**< Verificar se onde o carro aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele ser gerado */
				car.get(i).setX();
				car.get(i).setY();
			}

			cam.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "vermelho", false));
			while (mundo[cam.get(i).getX()][cam.get(i).getY()] == 2) {
			   /**< Verificar se onde o caminhão aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele ser gerado */
				cam.get(i).setX();
				cam.get(i).setY();
			}

			mot.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
			while (mundo[mot.get(i).getX()][mot.get(i).getY()] == 2) {
			   /**< Verificar se onde a moto aparece tem uma fábrica,caso tiver é criado uma outra posição para ela ser gerada */
				mot.get(i).setX();
				mot.get(i).setY();
			}
		}		
	}
	
	/**
	 * Função utilizada para zerar o mapa , para quando os veiculos se movimentarem não deixarem "rastros" por onde passam impedindo assim que "destruam" as fabricas e bordas
	 */
	public void refazerMapa() {
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mundo[i][j] != 1 && mundo[i][j] != 2) {
					mundo[i][j] = 0;
				}
			}
		}
		
		/**
		 * Gerando novos veiculos no mapa
		 */
		for (int a = 0; a < car.size(); a++) {
			//Armazenar as coordenadas do carro
			int xa = car.get(a).getX(); 
			int ya = car.get(a).getY();
			

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mundo[i][j] == 2) {
							mundo[i][j] = 2; 
							
						}
						else {
						  //Carro
							mundo[i][j] = 3;
							
						}
					}
				}
			}
		}
		
		for(int a  = 0; a < cam.size(); a++) {
			int ba = cam.get(a).getX();
			int ca = cam.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ba && j == ca) {
						if(mundo[i][j] == 2) {
							mundo[i][j] = 2;
							
						}
						else {
						  //Caminhão
							mundo[i][j] = 4;
							
						}
					}
				}
			}
		}
		
		for(int a = 0; a < mot.size(); a ++) {
			int ea = mot.get(a).getX();
			int fa = mot.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ea && j == fa) {
						if(mundo[i][j] == 2) {
							mundo[i][j] = 2;
							
						}
						else {
						  //Moto
							mundo[i][j] = 5;
							
						}
					}
				}
			}	
		}
		
	}
	
	/**
	 * Função para redesenhar o mundo com os veiculos em suas posições
	 */
	public void desenhandoMundo() {
		
		/**
		 * Contadores para exibir quantidade de veículos 
		 */
		int carros = 0;
		int motos = 0;
		int caminhoes = 0;
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					
					/**
					 * Colocar cores nos veiculos,bordas e fabricas
					 */
					if(mundo[i][j] == 1) {
						System.out.print("\u001b[47m \033[0m");
					}
					else if(mundo[i][j] == 0) {
						System.out.print(" ");
					}
					
					else if(mundo[i][j] == 2) {
						System.out.print("\u001b[42m \033[0m");
					}
					else if(mundo[i][j] == 3){
						System.out.print("\u001b[44m \033[0m");
					}
					else if(mundo[i][j] == 4){
						System.out.print("\u001b[41m \033[0m");
					}
					else if(mundo[i][j] == 5){
					  System.out.print("\u001b[43;1m \033[0m");
						
					}
					
				}
				
				System.out.println("");
			}	
			
			/**
			 * Colocando a legenda com sua respectiva cor e nome do veiculo
			 */
			System.out.print("\u001b[44m \033[0m");
			System.out.print(" Carros   ");
			System.out.print("\u001b[43;1m \033[0m");
			System.out.print(" Motos   ");
			System.out.print("\u001b[41m \033[0m");
			System.out.println(" Caminhões");
			
			/**
			 * Contadores de veículos
			 */
			for(int a = 0; a < car.size(); a++) {
				carros++;
			}
			for(int a = 0; a < cam.size(); a++) {
				caminhoes++;
			}
			for(int a = 0; a < mot.size(); a++) {
				motos++;
			}
			
		
			System.out.println("Número de Carros: " + carros);
			System.out.println("Número de Motos: " + motos);
				System.out.println("Número de Caminhões: " + caminhoes);
	}
	
	/**
	 * Função para atualizar o mundo e eles se moverem
	 */
	public void mundoAtualizado() {
		for(int i = 0; i < car.size(); i++) {
			car.get(i).movimento(car.get(i));
		}
		
		for (int i = 0; i < cam.size(); i ++) {
			cam.get(i).movimento(cam.get(i));
		}
		
		for (int i = 0; i < mot.size(); i ++) {
			mot.get(i).movimento(mot.get(i));
		}
		
		geradorVeiculo();
		colisao();
		refazerMapa();
		desenhandoMundo();
	}
	
	/**
	 * Função que detecta colisão
	 */
	public void colisao() {
		/// Colisão entre carros apenas
		for (int i = 0; i < car.size(); i ++) {
			for (int j = 0; j < car.size(); j++) {
				if(car.get(j).getX() == car.get(i).getX() && car.get(j).getY() == car.get(i).getY()) {
					if (i == j) { /// Essa parte verifica se o veículo é ele mesmo, e não o remove
						
					}
					else {
						car.remove(car.get(i));
					}	
				}
			}
		}
		
		/// Colisão entre caminhões apenas
		for (int i = 0; i < cam.size(); i ++) {
			for (int j = 0; j < cam.size(); j++) {
				if(cam.get(j).getX() == cam.get(i).getX() && cam.get(j).getY() == cam.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						cam.remove(cam.get(i));
					}	
				}
			}
		}
		
		/// Colisão entre motos apenas
		for (int i = 0; i < mot.size(); i ++) {
			for (int j = 0; j < mot.size(); j++) {
				if(mot.get(j).getX() == mot.get(i).getX() && mot.get(j).getY() == mot.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						mot.remove(mot.get(i));
					}	
				}
			}
		}
		
		/// Verifica Colisões= caminhão e carro
		for(int i = 0; i < cam.size(); i++) {
			for (int j = 0; j < car.size(); j++) {
				if(car.get(j).getX() == cam.get(i).getX() && car.get(j).getY() == cam.get(i).getY()) {
					if(cam.size() > car.size()) {
						
					}
					else {
						car.remove(car.get(j));
					}
				}
			}
		}
		
		/// Verifica Colisões=Caminhão e Moto
		for(int i = 0; i < cam.size(); i++) {
			for (int j = 0; j < mot.size(); j++) {
				if(mot.get(j).getX() == cam.get(i).getX() && mot.get(j).getY() == cam.get(i).getY()) {
					if(cam.size() > mot.size()) {
						
					}
					else {
						mot.remove(mot.get(j));
					}
				}
			}
		}
		
		/// Verifica Colisões = Carro e Moto
		for(int i = 0; i < car.size(); i++) {
			for (int j = 0; j < mot.size(); j++) {
				if(mot.get(j).getX() == car.get(i).getX() && mot.get(j).getY() == car.get(i).getY()) {
					if(car.size()>mot.size()) {
						
					}
					else {
						mot.remove(mot.get(i));
					}
					
				}
			}
		}
	}
	
	/**
	 * Função para quando os veiculos passarem na fabrica ser gerado outro veiculo igual ao que passou
	 */
	public void geradorVeiculo() {
		for(int a = 0; a < car.size(); a++) {
			int x = car.get(a).getX();
			int y = car.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mundo[i][j] == 2 && car.get(a).getFabrica() == false) {
								car.get(a).setFabrica(true); /// Já que o veículo passou numa fábrica, ele fica impossibilitado de gerar novamente caso não saia da fabrica
								car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
								}
							}
						}
					}
				}
		
		for(int a = 0; a < cam.size(); a++) {
			int x = cam.get(a).getX();
			int y = cam.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mundo[i][j] == 2 && cam.get(a).getFabrica() == false) {
								cam.get(a).setFabrica(true);
								cam.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "verde", false));
								}
							}
						}
					}
				}
		
	
		for(int a = 0; a < mot.size(); a++) {
			int x = mot.get(a).getX();
			int y = mot.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mundo[i][j] == 2 && mot.get(a).getFabrica() == false) {
								mot.get(a).setFabrica(true);
								mot.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
							}
						}
					}
				}
		}
	}
}
