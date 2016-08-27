/* CAIXA ELETRÔNICO
 * 1. Criar um menu de opções:
 * Menu Principal
 * 1 – Carregar Notas
 * 2 – Retirar Notas
 * 3 – Estatística
 * 9 – Fim
 * 
 * 1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências.
 * 1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao critério do maior pelo menor
 * 1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas.
 * 1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.
 * 1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem
 * “EXCEDEU O LIMITE DO CAIXA”.
 * 1.6. Solicitar até 100 retiradas ou até não haver mais notas.
 * 1.7. No momento da solicitação do valor, coletar também o código do banco que o cliente tem
 * conta segundo: 1 - Banco do Brasil, 2 - Santander, 3 - Itaú, 4 - Caixa
 * 1.8. No final, exibir a estatística, separada por bancos, com:
 * 		1.8.1. O maior e o menor valor sacado;
 * 		1.8.2. A média dos saques;
 *		1.8.3. Valor total dos saques;
 * 		1.8.4. Valor das sobras dos caixas.
 *
 * @Autor: Raphael Dinelli
 * Data da compilação: 05/08/2016
*/

import java.util.Scanner;

class Main{
    public static int[][] notas = new int[6][6];
    public static int quantidadeDeSaquesDisponiveis = 100;
    public static int saldoDoCaixa = 0;
    
    static void limpaTela(){
    	for(int i=0; i < 300; i++){
    		System.out.println("");
    	}
    }
	
	static void carregarNotas(int [][]matriz){
		int quantidadeDeNotas;
		notas[0][0] = 100;
		notas[0][1] = 50;
		notas[0][2] = 20;
		notas[0][3] = 10;
		notas[0][4] = 5;
		notas[0][5] = 2;
		limpaTela();
		System.out.println("__________CARREGAR NOTAS__________\n\n");
		for(int i=0; i< matriz.length; i++){
			System.out.println("\nDigite a quantidade de notas de R$" + matriz[0][i]);
			Scanner inQuantidadeDeNotas = new Scanner(System.in);
			quantidadeDeNotas = inQuantidadeDeNotas.nextInt();
			if(quantidadeDeNotas < 0){
				System.out.println("\nValor digitado inválido!");
				menu();
			}
			else{
				matriz[1][i] = quantidadeDeNotas;
			}
		}
		System.out.println("");
		for(int x=0; x< matriz.length; x++){
			System.out.printf("Quantidade de notas de RS%3d: %5d\n", matriz[0][x], matriz[1][x]);
		}
		calcularSaldo();
		System.out.println("\n\tSALDO DO CAIXA: R$" + saldoDoCaixa);
		System.out.println("\nPressione qualquer tecla e enter para finalizar.");
		Scanner inFinalizar = new Scanner(System.in);
		String finalizar = inFinalizar.next();
	}
	static void calcularSaldo(){
		for(int x= 0; x < notas.length; x++){
			saldoDoCaixa += notas[0][x] * notas[1][x]; 
		}
	}
	static void menu(){
		String[] opcoes = {"1 - Carregar notas", "2 - Retirar notas","3 - Estatística","9 - Fim"};
		int opcao;
		do{
			limpaTela();
			System.out.println("____________MENU____________\n\n");
			for(String i: opcoes){
				System.out.println(i);
			}
		System.out.println("\nEscolha a opção desejada: ");
		Scanner inOpcao = new Scanner(System.in);
		opcao = inOpcao.nextInt();
		switch(opcao){
			case 1:
				carregarNotas(notas);
				break;
		}
		}
		while(opcao != 9);
		limpaTela();
		System.out.println("\nSISTEMA FINALIZADO!!");
	}
	
	public static void main(String[] args){
		menu();
	}
}
