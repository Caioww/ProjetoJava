import java.util.Random;
public class Caminhao{
  
 
 //Método para gerar um caminhão em um lugar aleatório da matriz
  public void gerarCaminhao(){
    ca.add(new Caminhao());
    Random random= new Random();
			  int a =random.nextInt(29);
        int b =random.nextInt(59);
			  if(matrix[a][b] == 0 && matrix[a][b]!=2 && matrix[a][b]!=1 && matrix[a][b]!=3 && matrix[a][b]!=5){
			    matrix[a][b]=4;
			  
		}
	
  }
}
