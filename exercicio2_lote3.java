import java.util.Scanner;
import java.util.Random;
/* Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A média dos valores.
 *
 * @Autor: Raphael Dinelli
 * Data da compilação: 21/08/2016
*/

class Main {
  public static void preencherVetor(int[] array){
  	Random gerador = new Random();
  		for(int i=0;i < array.length;i++){
  			int numero = gerador.nextInt(99)+1;
  			array[i]= numero ;
  }
}
  
  public static void calcularMaiorMenor(int[] array){
  	int maior, menor;
  	maior = -1;
  	menor =-1;
  	for(int i=0; i < array.length; i++){
  		if(array[i] > maior){
  			if(menor < 0 && maior > 0){
  				menor = maior;
  				maior = array[i];
  			}
  			else{
  				maior = array[i];
  			}
  		}
  		else if(menor < 0){
  			menor = array[i];
  		}
  		else if(array[i] < menor){
  			menor = array[i];
  		}
    }
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
}
  public static void calcularMedia(int[] array){
  	int media = 0;
  	for(int i = 0; i < array.length; i++){
  		media += array[i];
  	}
  	media /= array.length;
  	System.out.println("Media dos números: " + media);
  }

  public static void main(String[] args) {
  	int[] myArray = new int[100];
  	preencherVetor(myArray);
  	for(int i=0; i<myArray.length;i++){
  		System.out.println(i + " - " + myArray[i]);
  	}
  	calcularMaiorMenor(myArray);
  	calcularMedia(myArray);
  }
}
