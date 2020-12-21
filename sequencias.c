// by TiagoDuraes



#include <stdio.h>

#define MAX 20000

int n, soma, i, j, melhor;
int v[MAX];

int main () {

  scanf("%d", &n); // ler n

  for (i=0; i<n; i++) { //guardar os n inteiros em v[i]
    scanf("%d", &v[i]); 
  }

  melhor = v[0];
  
  for(i=0;i<n-1;i++) {
    for(j=i ; j < n-1 ; j++){
      soma = 0;
      soma(i, j+1) = soma(i,j) + v[j+1];
      if(soma > melhor) {melhor = soma;}
    }
  }

  printf("%d\n", melhor);
  

  return 0;
}
