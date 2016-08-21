import java.util.Scanner;
/* Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * a. A média dos valores entre 10 e 200;
 * b. A soma dos números ímpares.
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

class Main {
  public static int calcularSomaEntre10e50(int[] array){
  		int total = 0;
  		int contadorDaMedia = 0;
  		int media;
  		for(int i=0; i < array.length; i++){
  			if(array[i] > 10 && array[i] < 200){
  				total += array[i];
  				contadorDaMedia ++;
  			}
  			
  		}
  		media = total / contadorDaMedia;
  		return media;
  }
  public static int somarNumerosImpares(int[] array){
  		int total = 0;
  		for(int i= 0; i < array.length; i++){
  			if(array[i] % 2 != 0){
  				total += array[i];
  			}
  		}
  		return total;
  }
  public static void main(String[] args) {
  		int[] vetor = new int[10];
  		int numero;
  		
  		for(int i = 0; i < 10; i++){
  			System.out.println("Digite um número inteiro: ");
  			Scanner inNumero = new Scanner(System.in);
  			numero = inNumero.nextInt();
  			vetor[i] = numero;
  		}
  		System.out.println("Media dos números entre 10 e 200: " + calcularSomaEntre10e50(vetor));
  		System.out.println("Soma dos números impares: " + somarNumerosImpares(vetor));
  }
}
