import java.util.Scanner;
/* Objetivo:Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * casa  1 2 3 4 5 6 7 8 
 * valor 1 2 4 8 ...
 * Exibir a soma dos valores.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  static int carregarMatrizESomar(int[][] array){
  	int total = 0;
  	for(int i=0; i < array.length; i++){
  		for(int j=0; j < array[0].length; j++){
  			if(i ==0){
  				array[i][j] = j+1;
  			}
  			else{
  				array[i][j] = (int)Math.pow(2,(j));
  				total += array[i][j];
  			}
  		}
    }
    return total;
  }
  public static void main(String[] args) {
  	int[][] matriz = new int[2][8];
  	int total = carregarMatrizESomar(matriz);
  	for(int i=0; i < matriz.length; i++){
  		System.out.println("");
  		for(int j=0; j < matriz[0].length; j++){
  			System.out.printf("%5d", matriz[i][j]);
  		}
  	
  	}
  	System.out.println("\nSoma dos valores: " + total);
  }
}
