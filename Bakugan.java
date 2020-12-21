//TiagoDuraes

import java.util.*;
import java.io.*;

class Bakugan{
	
	static int energia;
	static int min;
	static int max;
	static String code;
	
	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
		
		int Add = stdin.nextInt();
		int Rem = stdin.nextInt();
		
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i <(Add+Rem); i++){
			code = stdin.next();
			
			if(code.equals("BAK")){
				energia = stdin.nextInt();
				
				if(m.get(energia) == null)
					m.put(energia,1);
				else
					m.put(energia, m.get(energia)+1);
				
				
			} else 
				if(code.equals("MIN")){
					min = m.firstKey();
					System.out.println(min);
					if(m.get(min)-1 == 0)
						m.remove(min);
					else
						m.put(min,m.get(min)-1);
					
			    }
				
				if(code.equals("MAX")){
					max = m.lastKey();
					System.out.println(max);
					if(m.get(max)-1 == 0)
						m.remove(max);
					else
						m.put(max,m.get(max)-1);
				}	
				
			
			
		}
		
		
	}
	
	
	
	
	
	
}