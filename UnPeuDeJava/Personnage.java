import java.util.Scanner;
import java.io.IOException;
class Personnage{
  int x;
  int y;

  public Personnage(){
    this.x = 3;
    this.y = 3;
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void afficherPerso(){
    this.clearScreen();
    for (int ordonnee = 1 ; ordonnee < 6 ; ordonnee ++){
      for(int abcisse = 1; abcisse < 6; abcisse ++){
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

  public void deplacement(char a){
    if(a == 'z'){
      if(this.y - 1 > 0){
        this.y --;
      }
    }
    if(a == 'q'){
      if(this.x - 1 > 0){
        this.x --;
      }
    }
    if(a == 's'){
      if(this.y + 1 < 6){
        this.y ++;
      }
    }
    if(a == 'd'){
      if(this.x + 1 < 6){
        this.x ++;
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
    char carac = dep.charAt(0);
    while(carac != 'p'){
        carac = dep.charAt(0);
        truc.deplacement(carac);
        System.out.println("le deplacement");
        dep = scanner.nextLine();
    }

  }
}
