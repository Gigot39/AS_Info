import java.util.Scanner;
class Iterations {

  public void comptation(){

    for(int i = 0 ; i<101 ; i++){
      System.out.println(i);
    }

    for(int j = 100 ; j>0 ; j--){
      System.out.println(j);
    }

    for (int k = 0 ; k<101 ; k++){
      if (k%2 == 0){
        System.out.println(k);
      }
    }

  }


  public int CalculerCarrePair(int n){
    int resultat = 0;
    for(int i = 0 ; i < n+1 ; i++){
      resultat = resultat + i*i;
    }
    return resultat;

}
  public void Joursemaine(int n){
    for(int i = 0 ; i < n+1; i++){
      System.out.println("- semaine "+i+" -");
      for(int j = 1 ; j <= 7 ; j++){
        System.out.print(" "+j);
      }
    System.out.println();
    }
  }
  public static void main(String args[]){
    Iterations oncompte = new Iterations();
    Scanner sc = new Scanner(System.in);
    // oncompte.comptation();
    System.out.print("Saisir un nombre");
    int x = sc.nextInt();
    oncompte.Joursemaine(x);
    //int valeur = oncompte.CalculerCarrePair(x);
    //System.out.print(valeur);

    }

}
