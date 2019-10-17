import java.util.Scanner;
import java.io.IOException;

class Personnage{
  private int x;
  private int y;
  private String style;
  private String nom;

  public Personnage(){
    this.x = 3;
    this.y = 3;
    this.nom = "Conan";
    this.style = "Barbare";
  }
  public Personnage(String nom, String style){
    this.x = 3;
    this.y = 3;
    if( nom != ""){
        this.nom = nom;
    }
    if(style != ""){
      this.style = style;
    }
  }

  public void changerStyle(String x){
    if(x != null){
      this.style = x;
    }
  }

  public String toString(){
    return "( x="+ this.x+", y="+this.y+", nom="+this.nom+", style="+this.style+")";
  }

  public static void clearScreen() {

    char caractere  = System.getProperty("os.name").charAt(0);
    if(caractere == 'W'){
      //runtime.getRuntime().exec("cls");
      for(int i = 0; i < 30; i++){
        System.out.println();
      }
      //Runtime runtime = Runtime.getRuntime();
      //String[] args = { "cmd.exe", "cls" };
      //final Process process = runtime.exec(args);
    }
    else{
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
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
    System.out.print(truc.toString());
    truc.afficherPerso();

    System.out.println("le deplacement");
    String dep = scanner.nextLine();
    char carac = 'm';

    try{
      carac = dep.charAt(0);
    }
    catch(Exception e){truc.afficherPerso();}

    while(carac != 'p'){
      try{
        carac = dep.charAt(0);
        truc.deplacement(carac);
        System.out.println("le deplacement");
        dep = scanner.nextLine();
      }
      catch(Exception e){
        System.out.println("le deplacement");
        dep = scanner.nextLine();
        truc.afficherPerso();
      }
    }
  }
}
