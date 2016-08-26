import java.util.Scanner;
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

/* Receba 2 valores inteiros. 
 * Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main{
	static void menu(){
		String[] opcoes = {"1 - Carregar notas", "2 - Retirar notas","3 - Estatística","9 - Fim"};
		int opcao;
		System.out.println("__________Menu__________\n\n");
		do{
			for(String i: opcoes){
				System.out.println(i);
			}
		System.out.println("\nEscolha a opção desejada: ");
		Scanner inOpcao = new Scanner(System.in);
		opcao = inOpcao.nextInt();
		}
		while(opcao != 9);
		System.out.println("\nSISTEMA FINALIZADO!!");
	}
	
	public static void main(String[] args){
		menu();
	}
}
