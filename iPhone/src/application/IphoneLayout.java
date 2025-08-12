package application;

import java.io.Console;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import iphoneFuncoes.Funcoes;

public class IphoneLayout {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dt01 = LocalDateTime.now();
		
		int selecionarOpcao = 0;
		String url;
		Funcoes iphone = new Funcoes();
		
		
		System.out.println(dt01.format(sdf) + "         bateria:100%|");
		System.out.println("                                     |");
		System.out.println("1.Reprodutor de Música               |");
		System.out.println("2.Telefone                           |");
		System.out.println("3.Navegador de Internet              |");
		System.out.println("_____________________________________|");
		System.out.print("Selecione uma opção:");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			
			System.out.println("1. Tocar musica                      |");
			System.out.println("2. Pausar musica                     |");
			System.out.println("_____________________________________|");
			System.out.print("Selecione a opção:");
			selecionarOpcao = sc.nextInt();
			
				switch (selecionarOpcao) {
				case 1: 
					iphone.iniciar();
					break;
				
				case 2:
					iphone.pausar();
					break;
				}
			break;

		case 2:
			
			System.out.println("1.Ligar                              |");
			System.out.println("2.Atender                            |");
			System.out.println("3.Desligar                           |");
			System.out.println("_____________________________________|");
			System.out.print("Selecione a opção: ");
			selecionarOpcao = sc.nextInt();
			
				switch(selecionarOpcao) {
				
					case 1 :
						sc.nextLine();
						System.out.print("Digite o número: ");
						String numero = sc.nextLine();
						iphone.ligar(numero);
						break;
				
					case 2:
						iphone.atender();
						break;
					
					case 3:
						iphone.desligar();
						break;
				
			}
			break;
			
		case 3:
			sc.nextLine();
			System.out.println("1.Exibir página                      |");
			System.out.println("2.Adicionar nova página              |");
			System.out.println("3.Apagar página                      |");
			System.out.println("_____________________________________|");
			System.out.print("Selecione a opção:");
			selecionarOpcao = sc.nextInt();
			
				switch(selecionarOpcao) {
					
					case 1:
						sc.nextLine();
						System.out.print("digite a url: ");
						url = sc.nextLine();
						iphone.exibirPagina(url);
						break;
						
					case 2:
						sc.nextLine();
						System.out.print("digite a url: ");
						url = sc.nextLine();
						iphone.novaPagina(url);
						break;
						
					case 3:
						sc.nextLine();
						System.out.print("digite a url: ");
						url = sc.nextLine();
						iphone.apgarPagina(url);
						break;		
				
				}
			
			break;
		}
		
		
		sc.close();
	}
	
	
	

}
