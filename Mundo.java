import java.util.ArrayList;

public class Mundo {
	/**
	 * Instanciando a classe veículo
	 */
	Veiculo v = new Veiculo();
	/**
	 * Gerando ArrayList de cada um dos veículos
	 */
	ArrayList <Carro> car = new ArrayList<>();
	ArrayList <Caminhao> cam = new ArrayList<>();
	ArrayList <Moto> mot = new ArrayList<>();

	public int mapa[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
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
	 * Função que gera veículos aleatóriamente
	 */
	public void geraVeiculos() {
		for(int i = 0; i < 10; i++) {
			car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
			while (mapa[car.get(i).getX()][car.get(i).getY()] == 2) { /**< Verificando se o carro foi gerado onde há uma fábrica, se sim, trocando-o */
				car.get(i).setX();
				car.get(i).setY();
			}

			cam.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
			while (mapa[cam.get(i).getX()][cam.get(i).getY()] == 2) {
				cam.get(i).setX();
				cam.get(i).setY();
			}

			mot.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
			while (mapa[mot.get(i).getX()][mot.get(i).getY()] == 2) {
				mot.get(i).setX();
				mot.get(i).setY();
			}
		}		
	}
	
	/**
	 * Função que zera o mapa, acabando com o rastro que ficaria caso o mapa não fosse zerado
	 */
	public void refazerMapa() {
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mapa[i][j] != 1 && mapa[i][j] != 2) {
					mapa[i][j] = 0;
				}
			}
		}
		
		/**
		 * Adicionando os novos veículos no mapa
		 */
		for (int a = 0; a < car.size(); a++) {
			/// Obtendo as corrdenadas do veículo
			int xa = car.get(a).getX(); 
			int ya = car.get(a).getY();
			

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2; /// SObrescrevendo 2 caso seja uma fábrica
							
						}
						else {
							mapa[i][j] = 3;
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
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 4;
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
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 5;
						}
					}
				}
			}	
		}
		
	}
	
	/**
	 * Função que desenha o mundo
	 */
	public void desenhaMundo() {
		
		/**
		 * Contadores para exibir quantidade de veículos
		 */
		int carros = 0;
		int motos = 0;
		int caminhoes = 0;
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					
					/**
					 * Desenhando o mapa com base no que foi refeito
					 */
					if(mapa[i][j] == 1) {
						System.out.print("\u001b[47m \033[0m");
					}
					else if(mapa[i][j] == 0) {
						System.out.print(" ");
					}
					
					else if(mapa[i][j] == 2) {
						System.out.print("\u001b[42m \033[0m");
					}
					else if(mapa[i][j] == 3){
						System.out.print("\u001b[44m \033[0m");
					}
					else if(mapa[i][j] == 4){
						System.out.print("\u001b[43;1m \033[0m");
					}
					else if(mapa[i][j] == 5){
						System.out.print("\u001b[41m \033[0m");
					}
					
				}
				
				System.out.println("");
			}	
			
			/**
			 * Imprimindo a legenda
			 */
			System.out.print("\u001b[44m \033[0m");
			System.out.print(" Carros   ");
			System.out.print("\u001b[41m \033[0m");
			System.out.print(" Motos   ");
			System.out.print("\u001b[43;1m \033[0m");
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
			
		
			System.out.println("Número de carros: " + carros);
			System.out.println("Número de caminhões: " + caminhoes);
			System.out.println("Número de motos: " + motos);
	}
	
	/**
	 * Função que atualiza o mundo fazendo os veículos se moverem
	 */
	public void atualizaMundo() {
		for(int i = 0; i < car.size(); i++) {
			car.get(i).movimento(car.get(i));
		}
		
		for (int i = 0; i < cam.size(); i ++) {
			cam.get(i).movimento(cam.get(i));
		}
		
		for (int i = 0; i < mot.size(); i ++) {
			mot.get(i).movimento(mot.get(i));
		}
		
		geraVeiculo();
		detectaColisao();
		refazerMapa();
		desenhaMundo();
	}
	
	/**
	 * Função que detecta colisão
	 */
	public void detectaColisao() {
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
		
		/// Colisão entre caminhão e carro
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
		
		/// Colisão entre caminhão e moto
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
		
		/// Colisão entre carro e moto
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
	 * Função que gera um veículo se passarem em fábricas
	 */
	public void geraVeiculo() {
		for(int a = 0; a < car.size(); a++) {
			int x = car.get(a).getX();
			int y = car.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && car.get(a).getFabrica() == false) {
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
							if(mapa[i][j] == 2 && cam.get(a).getFabrica() == false) {
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
							if(mapa[i][j] == 2 && mot.get(a).getFabrica() == false) {
								mot.get(a).setFabrica(true);
								mot.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
							}
						}
					}
				}
		}
	}
}
