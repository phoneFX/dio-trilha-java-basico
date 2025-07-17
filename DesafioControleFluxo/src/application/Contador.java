package application;

import java.util.Locale;
import java.util.Scanner;

import trataments.ParametrosInvalidosException;

public  class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] parametro = new int[2];
		
		for (int i = 0; i < parametro.length; i++) {
			System.out.print("Digite o " + (i+1) + "º parâmetro: ");
			parametro[i] = sc.nextInt();
		}
		
		
		try {
			Contar(parametro[0], parametro[1]);
		
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		
		
		
		sc.close();
	}
	
	
	
	public static void Contar(int i, int j) throws ParametrosInvalidosException {
		int interacao = 1;
	
			if (i > j) {
				throw new ParametrosInvalidosException("1º parâmetro deve ser menor que o 2º parâmetro");
			}
			else {
				for (int j2 = i; j2 < j ; j2++) {
					System.out.println("Interação: " + interacao);
					interacao++;
				
				}
			}
		
		
		
	}
	
	
	
	

	}


