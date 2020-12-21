//TiagoDuraes


import java.util.*;


class Trocados{
	
	static int nm;
	
	public static void main(String [] args){
		
		Scanner stdin= new Scanner(System.in);
		
		nm = stdin.nextInt();
		
		int moedas[] = new int [n];
		
		for(int i=0; i<nm; i++){
			moedas[i] = stdin.nextInt();
		}
		
		int np = stdin.nextInt();
		int perguntas[] = new int [np];
		
		for(int i = 0; i< np;i++){
			perguntas[i] = stdin.nextInt();
			trocos(perguntas[i], moedas);
			
		}
		
		
	}
	
	
	static void trocos(int Pergunta, int moedas[]){
		int caso[] = new int [Pergunta + 1];
		int usado[] = new int [Pergunta + 1];
		
		caso[0] = 0;
		
		for(int i = 1; i < Pergunta + 1; i++){
			
			caso[i] = Integer.MAX_VALUE;
			
			for(int k=0; k < nm; k++){
				if(moedas[k] <= i && 1 + caso[i - moedas[k]] < caso[i]){
					caso[i] = 1 + caso[i - moedas[k]];
					usado[i] = moedas[k];
				}
			}
		}
		int P2 = Pergunta;
		System.out.print(Pergunta + ": " + "[" + caso[Pergunta] + "]" + " ");
        System.out.print(usado[P2]);
		
		while(P2 != 0){                          
			P2 = P2 - usado[P2];                    
			if(usado[P2] == 0){
				break;
			}
            System.out.print(" ");     
			System.out.print(usado[P2]);
			
		}
		System.out.println();

		
	}
	
	
	
}