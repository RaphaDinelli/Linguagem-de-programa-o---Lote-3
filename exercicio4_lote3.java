import java.util.Scanner;
import java.util.Random;
/* Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
 * a. A média do grupo;
 * b. A quantidade de notas acima do grupo;
 * c. As posições dos valores abaixo da média do grupo.
 * @Autor: Raphael Dinelli
 * Data da compilação: 23/08/2016
*/

class Main {
  public static void preencherVetor(double[] array){
  	Random gerador = new Random();
  		for(int i=0;i < array.length;i++){
  			double numero = gerador.nextDouble()*10;
  			array[i]= numero ;
  }
}
 public static void mostrarvetor(double[] vetor){
 	for(int i=0; i < vetor.length; i++){
 		System.out.println(vetor[i]);
 	}
 }
 public static double calcularMedia(double[] array){
 	double media = 0;
 	for(int i=0; i< array.length; i++){
 		media += array[i];
 	}
 	media /= array.length;
 	return media;
 }
 public static int calcularAcimaDaMedia(double[] array){
 	double media = calcularMedia(array);
 	int acimaDaMedia = 0;
 	for(int i= 0; i< array.length; i++){
 		if(array[i] > media){
 			acimaDaMedia ++;
 		}
 	}
 	return acimaDaMedia;
 }
 public static void posicoesAbaixoDaMedia(double[] array){
 	double media = calcularMedia(array);
 	for(int i = 0; i < array.length; i++){
 		if(array[i] < media){
 			System.out.println("Valor abaixo da média na posição: " + i);
 		}
 	}
 }
 
  public static void main(String[] args) {
  	double[] vetorDeReal = new double[30];
  	preencherVetor(vetorDeReal);
  	mostrarvetor(vetorDeReal);
  	System.out.println("Media do grupo: " + calcularMedia(vetorDeReal));
  	System.out.println("Notas acima da media: " + calcularAcimaDaMedia(vetorDeReal));
  	posicoesAbaixoDaMedia(vetorDeReal);
  }
}
