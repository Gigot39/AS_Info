import java.util.Scanner;
class Personnage{
  int x;
  int y;

  public Personnage(){
    this.x = 3;
    this.y = 3;
  }
  public void afficherPerso(){
    for (int abcisse = 1 ; abcisse < 6 ; abcisse ++){
      for(int ordonnee = 1; ordonnee < 6; ordonnee ++){
        if(abcisse == this.x && ordonnee == this.y){
          System.out.print("*");
        }
        else{
          System.out.print(".");
        }
      }
      System.out.println();
    }
  }
  public void deplacement(String a){
      System.out.println(a == "haut");
    if(a == "haut"){
      if(this.y - 1 > -1){
        this.y --;
      }
    }
    if(a == "gauche"){
      if(this.x - 1 > -1){
        this.x --;
      }
    }
    if(a == "droite"){
      if(this.x + 1 < 5){
        this.x ++;
      }
    }
    if(a == "bas"){
      if(this.y + 1 < 5){
        this.y ++;
      }
    }
    this.afficherPerso();
  }
  public static void main (String[] args){
    Scanner scanner = new Scanner( System.in );
    Personnage truc = new Personnage();
    truc.afficherPerso();

    System.out.println("le deplacement");
    String dep = scanner.nextLine();

    while(dep != "Quitter"){
        truc.deplacement(dep);
        System.out.println("le deplacement");
        dep = scanner.nextLine();
    }

  }
}
