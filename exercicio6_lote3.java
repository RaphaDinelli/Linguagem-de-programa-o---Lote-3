import java.util.Scanner;
import java.util.Random;
/* Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3].
 * Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
 * @Autor: Raphael Dinelli
 * Data da compilação: 23/08/2016
*/

class Main {
  public static void preencherVetor(int[] array){
  	Random gerador = new Random();
  		for(int i=0;i < array.length;i++){
  			int numero = gerador.nextInt(99)+1;
  			array[i]= numero ;
  }
}

  public static void ordenarVetor(int[] array){
  	int auxiliar;
  	
  	for(int i=0; i < array.length; i++){
  		for(int j=0; j< array.length; j++){
  			if(array[j] > array[i]){
  				auxiliar = array[i];
  				array[i] = array[j];
  				array[j] = auxiliar;
  			}
  		}
  	}
  }

  public static void main(String[] args) {
  	int[] vetor20 = new int[20];
  	preencherVetor(vetor20);
  	
  	for(int i=0; i < vetor20.length; i++){
  		System.out.printf("posição: %2d | %2d\n" ,i, vetor20[i]);
  	}
  	
  	ordenarVetor(vetor20);
  	
  	for(int i=0; i < vetor20.length; i++){
  		System.out.printf("posição: %2d | %2d\n" ,i, vetor20[i]);
  	}
}
}
