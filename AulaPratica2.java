package aulapratica;

import java.util.Scanner;

public class AulaPratica2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		Scanner ler = new Scanner(System.in);
				
		        System.out.println("Digite a nota final da avaliação 1: ");
		        nota1 = ler.nextFloat();
		        
		        System.out.println("Digite a nota final da avaliação 2: ");
		        nota2 = ler.nextFloat();
		        
		        System.out.println("Digite a nota final da avaliação 3: ");
		        nota3 = ler.nextFloat();
		        
		        System.out.println("Digite a nota final da avaliação 4: ");
		        nota4 = ler.nextFloat();
		        
		        System.out.println("Sua média final é: ");
				System.out.println((nota1 + nota2 + nota3 + nota4) / 4);
		        
		        ler.close();
		        

	}

}
