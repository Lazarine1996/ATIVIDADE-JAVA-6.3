package aulapratica;

import java.util.Scanner;

public class AulaPratica1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		Scanner ler = new Scanner(System.in);
				
		        System.out.println("Digite o seu salário: ");
		        salario = ler.nextFloat();
		        
		        System.out.println("Digite o abono conquistado: ");
		        abono = ler.nextFloat();
		        
		        System.out.printf("Seu novo salario será de: %.2f " , salario + abono);
		        
		        ler.close();
				
				
		
		
		

	}

}
