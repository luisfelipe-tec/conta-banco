package banco.conta;

import java.util.Scanner;

public class ContaTerminal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(cadastraConta());
	}
	
	public static String cadastraConta() {
		Integer numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		String cadastroCompleto;
		
		System.out.println("Por favor, digite o número da CONTA:");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o número da AGÊNCIA?");
		agencia = sc.next();
		sc.nextLine();
		System.out.println("Por favor, digite o seu nome:");
		nomeCliente = sc.next();
		sc.nextLine();
		System.out.println("Por favor, digite o seu saldo:");
		saldo = sc.nextDouble();
		sc.nextLine();
		
		
		cadastroCompleto = ("Olá " +nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+numero.toString()+ 
							" e seu saldo "+saldo.toString()+ " já está disponível para saque.");
		
		
		return cadastroCompleto;
	}

}
