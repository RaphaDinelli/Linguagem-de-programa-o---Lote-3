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
  public static void concatenarVetor(int[] array1, int[] array2, int[] arrayConcatenado){
  	for(int i=0; i< arrayConcatenado.length; i++){
  		if(i<3){
  			arrayConcatenado[i] = array1[i]; 
  		}
  		else{
  			arrayConcatenado[i] = array2[i - 3]; 
  		}
  	}
  		
  	
  }
  public static void main(String[] args) {
  	int[] vetor1 = new int[3];
  	int[] vetor2 = new int[3];
  	int[] vetorConcatenado = new int[6];
  	
  	preencherVetor(vetor1);
  	preencherVetor(vetor2);
  	concatenarVetor(vetor1, vetor2, vetorConcatenado);
  	
  	System.out.println("Vetor 1");
  	for(int i=0; i < vetor1.length; i++){
  		System.out.println(vetor1[i]);
  	}
  	System.out.println("Vetor 2");
  	for(int i=0; i < vetor2.length; i++){
  		System.out.println(vetor2[i]);
  	}
  	System.out.println("Vetor concatenado");
  	for(int i=0; i < vetorConcatenado.length; i++){
  		System.out.println(vetorConcatenado[i]);
  	}
  }
}
