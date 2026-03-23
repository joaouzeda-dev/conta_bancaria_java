package contabancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "Joao Uzeda";
		String tipoConta = "Corrente";
		double saldo = 2000.00;
		int opcao =0;
		
		System.out.println("\n***************************");
		System.out.println("\nNome Cliente: " + nome);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("\n***************************");
		
		String menu = """
				*** Digite uma opção ***
				[1] - Consultar conta.
				[2] - Transferir valor.
				[3] - Depositar valor.
				[4] - Sair.
				""";
		
		while (opcao != 4) {
			System.out.println(menu);
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("O saldo atual e: " + saldo);
			}else if (opcao == 2) {
				System.out.println("Quanto deseja tranferir: " );
				double valor = sc.nextDouble();
				if (valor > saldo) {
					System.out.println("Saldo insuficiente para realizar a transferencia");
				}else {
					saldo = saldo - valor; 
					System.out.println("Novo saldo: " + saldo);
				}
			}else if (opcao == 3) {
				System.out.println("Digite o valor recebido: ");
				double valor = sc.nextDouble();
				saldo = saldo + valor;
				System.out.println("Novo saldo: " + saldo);
			}else if (opcao != 4) {
				System.out.println("Opcao invalida.");
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
