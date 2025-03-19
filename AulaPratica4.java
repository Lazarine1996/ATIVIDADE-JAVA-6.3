package aulapratica;

import java.util.Scanner;

public class AulaPratica4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner ler = new Scanner(System.in);
				
		        System.out.print("Digite o primeiro número de entrada: ");
		        n1 = ler.nextFloat();
		        
		        System.out.print("Digite o segundo número de entrada: ");
		        n2 = ler.nextFloat();
		        
		        System.out.print("Digite o terceiro número de entrada: ");
		        n3 = ler.nextFloat();
		        
		        System.out.print("Digite o quarto número de entrada: ");
		        n4 = ler.nextFloat();
		        
		        diferenca = (n1 * n2) - (n3 * n4);
		        
		        System.out.printf("Diferença: %.1f\n", diferenca);
				
		        
		        ler.close();
	}

}
