import java.io.*;
import java.util.*;



// Classe para guardar um nome
class Equipa implements Comparable<Equipa> {
    public int vitorias, empates, derrotas,gol_marcados, gol_sofridos, pontos, gol_average;
    public String name;

    Equipa(String Nome, int vitorias, int empates, int derrotas, int gol_marcados, int gol_sofridos) {
	name = Nome;
	this.vitorias = vitorias;
	this.empates = empates;
	this.derrotas = derrotas;
	this.gol_marcados = gol_marcados;
	this.gol_sofridos = gol_sofridos;

	pontos = vitorias*3 + empates*1 + derrotas*0;
	gol_average = gol_marcados - gol_sofridos;
	
    }
	
    // Definir como comparar dois elementos da classe Equipa
    // compareTo e uma funcao que compara objecto com outro objecto "p"
    // Esta funcao deve devolver:
    //  - numero < 0 se objecto for menor que objecto "p"
    //  - numero > 0 se objecto for maior que objecto "p"
    //  - zero, se objecto for igual ao objecto "p"
    @Override
    public int compareTo(Equipa p) {
	if (pontos < p.pontos) return +1;
	if (pontos > p.pontos) return -1;
	if (gol_average < p.gol_average) return +1;
	if (gol_average > p.gol_average) return -1;
	return name.compareTo(p.name);
    }
}






class Prob006{
	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
		
		int Nequipas = stdin.nextInt();
		
		Equipa n[] = new Equipa[Nequipas];
		
		for (int i = 0; i<Nequipas; i++){
			n[i] = new Equipa(stdin.next(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt());
		}
		
		Arrays.sort(n);
		
		for (int i = 0; i<Nequipas; i++){
	    System.out.println(n[i].name + " " + n[i].pontos + " " + n[i].gol_average);
		}
		
    }
		
		
		
		
}
	
