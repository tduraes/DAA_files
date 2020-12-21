import java.util.*;


class BinarySearch{
	
    public static void main(String args []){
	Scanner stdin = new Scanner(System.in);
		
	int size1 = stdin.nextInt();                     
		
	int numerosS [] = new int [size];
		
	int somas [] = new int [size*size];
		
	for(int i=0; i < size1; i++){
	    numerosS[i] = stdin.nextInt();
	}
		
	int k = 0;
		
	for(int i = 0; i<size1; i++){
	    for(int j = 0; c<size1; c++){
		if(numerosS[i] != numerosS[c]){ 	//Não somar um numero com o proprio
		    somas[k] = numerosS[i]+numerosS[j];	//Guardar todas as somas
		    k++;
		}
	    }
	}
		
	Arrays.sort(somas); //Ordenar
		
	//Remover zeros a mais
	
	int [] somas2 = clear(somas);
		
	int size2 = stdin.nextInt();
		
	for(int i = 0; i<size2;i++){
	    bs(stdin.nextInt() , somas2); //Print com base no BS
	}
		
    }
	
    public static void bs(int p, int [] somas){
	int low=0;
	int high=somas.length-1;
	int mid=0;
         
         
        while(1 < high - low) {
            mid = low + (high-low)/2;
     
            if(somas[mid] < p)
                low = mid;
            else
                high = mid;
        }
 
         
	if (p - somas[low] == somas[high] - p && somas[low] != p && somas[high]!= p)
	    System.out.println(somas[low] + " " + somas[high]);
	else{
	    if( p - somas[low] < somas[high] - p)
		System.out.println(somas[low]);
	    else
		System.out.println(somas[high]);
             
        }
    }
 
 
    public static int [] clear(int [] v){
        List<Integer> l= new ArrayList<Integer>();
        int c=0;
 
        for( int i=0;  i < v.length;  i++ ){
            if (v[i] != 0){
                l.add(v[i]);
                c++;
            }
        }
 
        int array [] = new int [c];
 
        for (int i=0; i < c; i++)
            array[i]=(Integer)l.get(i);
 
        return array;
    }
	
	
}
