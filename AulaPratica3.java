package aulapratica;

import java.util.Scanner;

public class AulaPratica3 {

	public static void main(String[] args) {
		
		float SalarioBruto;
		float Adicional;
		float HorasExtras;
		float Descontos;
		
		Scanner ler = new Scanner(System.in);
				
		        System.out.print("Digite o valor do Salário Bruto: ");
		        SalarioBruto = ler.nextFloat();
		        
		        System.out.print("Digite o valor do Adicional Noturno: ");
		        Adicional = ler.nextFloat();
		        
		        System.out.print("Digite o valor das Horas Extras: ");
		        HorasExtras = ler.nextFloat();
		        
		        System.out.print("Digite o valor a ser descontado: ");
		        Descontos = ler.nextFloat();
		        
		       
		        System.out.printf("O valor a receber é: %.2f", SalarioBruto + Adicional + (HorasExtras * 5) - Descontos);
		   
		        
		        ler.close();
				
		

	}

}
