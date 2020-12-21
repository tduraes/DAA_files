//Fiz a primeira parte do problema em C,que esta submetida no mooshack, mas depois achei melhor resolver em java, apesar de ter precisado de alguma ajuda na implementação

import java.util.Scanner;


public class Sequencias{
	
	static int n; 
        static int numbers[];
	static int soma;
	static int MaxSum; 
	
	public static void main(String args[]){
		
		Scanner stdin = new Scanner(System.in);
	        
		n = stdin.nextInt();
		numbers = new int[n];
		
		//ler sequencia de numeros
		for(int i=0; i< Nnum; i++){
			numbers[i] = stdin.nextInt(); 
		}
		
		DoSum();
		
	}
	
	public static void DoSum(){
		
		soma = numbers[0];
		MaxSum = soma;

		
		for(int i=1; i<Nnum;i++){
			
			if(soma < 0)
			   soma = 0;
			
			if(soma + numbers[i] > MaxSum)
			   MaxSum = soma + numbers[i];
			
			soma += numbers[i];
		}
		
		System.out.println(MaxSum);	
	}
}
