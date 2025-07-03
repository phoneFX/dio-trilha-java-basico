package application;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da sua agência: ");
		String agencia = sc.nextLine();
		
		System.out.print("Conta: ");
		int user = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("Digite o nome completo: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o seu saldo de depósito: ");
		BigDecimal saldo = sc.nextBigDecimal();
		
		System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é  " +
						   agencia + ", conta " + user + " e seu saldo de R$" + saldo + " já está disponível"
						   		+ "para saque");
		
		
		sc.close();
		
	}

}
