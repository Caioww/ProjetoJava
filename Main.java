//Carro =3 , Moto=4  ,Caminhao=5


import java.util.ArrayList;
import java.util.Random;


public class Main {
  
  //Declaração Global dos ArrayLists para poder armazenar a quantidade
  // de cada veiculo
  public static ArrayList <Carro> c = new ArrayList<>();
  public static ArrayList <Caminhao> ca = new ArrayList<>();
  public static ArrayList <Moto> m = new ArrayList<>();
  
  
public static void main(String[] args) 
	{
		int [][] matrix = new int[30][60];
		for(int x = 0; x < matrix.length; x++)
		{
			for (int i = 0; i < matrix[x].length; i++) 
			{
				if((x==0)||(x==(matrix.length)-1))
					matrix[x][i]=1;
				else
					if((i==0)||(i==(matrix[x].length)-1))
						matrix[x][i]=1;
					else
						matrix[x][i]=0;
			}
		}
			
		for(int x = 0; x < matrix.length; x++)
		{
			for (int i = 0; i < matrix[x].length; i++) 
			{
			if(matrix[x][i] == 0){
			  for(int n = 5; n < 12 ;n++){
			    for(int m = 3; m <= 5 ;m++){
          matrix[m][n] = 2;
			      
			    }
			  }
			  for(int n = 5; n < 12 ;n++){
			    for(int m = 26; m <= 28 ;m++){
          matrix[m][n] = 2;
			      
			    }
			  }
			  for(int n = 48; n < 55 ;n++){
			    for(int m = 3; m <= 5 ;m++){
          matrix[m][n] = 2;
			      
			    }
			  }
			  for(int n = 48; n < 55 ;n++){
			    for(int m = 26; m <= 28 ;m++){
          matrix[m][n] = 2;
			      
			    }
			  }
			  for(int n =26 ; n <33  ;n++){
			    for(int m =13 ; m <= 15 ;m++){
          matrix[m][n] = 2;
			      
			    }
			  }
			  
	
      }
				System.out.print(matrix[x][i]);
			}
System.out.println();
		}
		
		//Instanciando objetos para usar as funçoes
		Caminhao caminhoes = new Caminhao();
		Carro carros = new Carro();
		Moto motos = new Moto();
		
		for(i=0;i<10;i++){ //Inicializar com 10 de cada veiculo
		carros.gerarCarro();
		motos.gerarMoto();
		caminhoes.gerarCaminhao();;
		}
		
		
		//Utilizando as funções com objetos
		carros.gerarCarro();
		motos.gerarMoto();
		caminhoes.gerarCaminhao();
		
		
		//Código para printar a matriz após cada veiculo adicionado
		for(int x = 0; x < matrix.length; x++)
		{
			for (int i = 0; i < matrix[x].length; i++) 
			{
			  System.out.print(matrix[x][i]);
			}
			System.out.println();
		}
			
			 
		
	
		}
}
		
	