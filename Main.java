import java.util.Random;

class Lista{
  int [] elementos;
  int qtde;
  int cap;
  Lista (){
      elementos = new int [4];
      qtde = 0;
      cap = 4;
  }

  boolean estaCheia (){
    return qtde >= cap;
    //return qtde == cap ? true : false;
  }

 

  void aumentar (){
    //alocar um novo vetor com o dobro do tamanho
    int [] aux = new int[cap * 2];
    
    //copiar os elementos para o novo vetor
    for (int i = 0; i < qtde; i++){
      aux[i] = elementos[i];
    }
    //dobrar a capacidade
    cap *= 2;
    //ajustar a variável de referência
    elementos = aux;
  }

  void inserir (int e){
    if (estaCheia())
      aumentar();
    elementos[qtde] = e;
    qtde++;
  }

  void exibir(){
    System.out.printf ("*******************\n");
    System.out.printf ("Qtde: %d\n", qtde);
    System.out.printf ("Cap: %d\n", cap);
    for (int i = 0; i < this.qtde; i++){
      System.out.printf ("%d ", this.elementos[i]);
    }
    System.out.printf ("\n");
  }
}


class Main {
  public static void main(String[] args) {
    Random gerador = new Random();
    Lista umaLista = new Lista();
    for (int i = 0; i < 100; i++){
      int dado = gerador.nextInt(20) + 1;
      umaLista.inserir(dado);
      umaLista.exibir();
    }
  }
}