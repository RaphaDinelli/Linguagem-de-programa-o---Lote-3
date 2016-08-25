import java.util.Scanner;
import java.util.Random;
/* Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos
 * vendidos em 4 semanas. Calcular e exibir:
 * 	a. A quantidade de cada produto vendido no mês;
 * 	b. A quantidade de produtos vendidos por semana;
 *  c. O total de produtos vendidos no mês.
 * @Autor: Raphael Dinelli
 * Data da compilação: 23/08/2016
*/

class Main {
  static void preencheMatriz(int[][] matriz){
  	int x, y;
  	Random gerador = new Random();
  	
  	for(x=0;x < matriz.length; x++){
  		for(y=0; y < matriz[0].length; y++){
  			int numeroAleatorio = gerador.nextInt(9)+1;
  			matriz[x][y] = numeroAleatorio;
  		}
  	}
  }
  static int[] somarProdutosNoMes(int[][] matriz){
  	int[] somaDosProdutos = new int[4];
  	for(int x=0; x < matriz.length; x++){
  		for(int y=0; y < matriz[0].length;y++){
  			somaDosProdutos[x] += matriz[x][y];
  		}
  	}
  	return somaDosProdutos;
  }
  static int[] somarProdutosNaSemana(int[][] matriz){
  	int[] somaDaSemana = new int[3];
  	for(int x=0;x < matriz.length; x++){
  		for(int y=0; y < matriz[0].length; y++){
  			somaDaSemana[y] += matriz[x][y];
  		}
  	}
  	return somaDaSemana;
  }
  public static void main(String[] args) {
  	int[][] produtos = new int[4][3];
  	preencheMatriz(produtos);
  	int[] produtosSomados = new int[4];
  	int[] produtosNaSemana = new int[3];
  	int totalDeProdutosVendidos = 0;
  	
  	produtosSomados = somarProdutosNoMes(produtos);
  	produtosNaSemana = somarProdutosNaSemana(produtos);
  	totalDeProdutosVendidos = produtosNaSemana[0] + produtosNaSemana[1] + produtosNaSemana[2];
  	
  	System.out.printf("Soma dos produtos:\nProduto 1: %5d\nProduto 2: %5d\nProduto 3: %5d\nProduto 4: %5d\n", produtosSomados[0], produtosSomados[1], produtosSomados[2], produtosSomados[3]);
  	System.out.printf("\nProdutos vendidos na semana:\nSemana 1: %5d\nSemana 2: %5d\nSemana 3: %5d\n", produtosNaSemana [0], produtosNaSemana [1], produtosNaSemana[2]);
  	System.out.printf("\nTotal dos produtos vendidos: %5d", totalDeProdutosVendidos);
  	
  }
}
