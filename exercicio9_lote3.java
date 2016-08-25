import java.util.Scanner;
import java.util.Random;
/* Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a
 * diagonal principal terá seus dados carregados no programa segundo:
     1 
        4 
           8 
              16
 * @Autor: Raphael Dinelli
 * Data da compilação: 23/08/2016
*/

class Main {
  static void preencheMatriz(int[][] matriz){
  	Random gerador = new Random();
  	for(int x=0; x < matriz.length; x++){
  		for(int y=0; y < matriz[0].length; y++){
  			if(x == y){
  				double result = Math.pow(2, x+1);
  				matriz[x][y] = (int)result;
  			}
  			else{
  				int numeroAleatorio = gerador.nextInt(9)+1;
  				matriz[x][y] = numeroAleatorio;
  			}
  		}
  	}
  }
  public static void main(String[] args) {
  	int[][] array4Por4 = new int[4][4];
  	preencheMatriz(array4Por4);
  	for(int x=0; x < array4Por4.length; x++){
  		System.out.println("");
  		for(int y = 0; y < array4Por4[0].length; y++){
  			System.out.printf("%3d", array4Por4[x][y]);
  		}
  	}
 }
}
