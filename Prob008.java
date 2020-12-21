import java.util.*;

class Mochila{
	
	static int distancias[];
	public static boolean check(int mid, int dia) {

	    boolean teste = true;
	    int soma = 0;
        
	    for (int i=0; i<distancias.length; i++){
            
		if (soma + distancias[i] <= mid && dia > 0){
		    soma += distancias[i];
		}
		else{
		    if (mid >= distancias[i]) {
			soma = distancias[i];
			dia--;
		    }
		    else teste = false;
		}
	    }
	    if (dia <= 0) teste = false;
	    return teste;
	}
	
    public static int bs (int low, int high, int dia) {
        int mid = (low + high) / 2;
        while (low < high) {
    
            if (low == high)
		return low;
            else if (check(mid, dia))
		return bs (low, mid, dia);
            else return bs (mid + 1, high, dia);
        }
        return high;
	    }
	
	
	
	
    public static void main(String args []){
	Scanner stdin = new Scanner(System.in);
		
	int d = stdin.nextInt();
		
	distancias = new int [d];
		
	int contakm = 0;
		
	for(int i = 0; i<n; i++){
	    distancias[i] = stdin.nextInt();
	    contakm += distancias[i];
	}
		
	int p = stdin.nextInt();
		
	for(int i = 0; i<p; i++){
	    int dia;
	    dia = stdin.nextInt();
	    int preguica = bs(1, somatorio, dia);
	    System.out.println(preguica);
	}
    }
	
	
	
	
}
