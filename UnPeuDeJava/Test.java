import java.util.Scanner;
class Test{

  public void dessinerCarre(int a){
    for (int i = 0 ; i < a ; i++) {
      for (int j = 0 ; j < a ; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public void noSemaine(int a){
    for ( int i=1 ; i < a ; i++ ){
      System.out.println("-Semaine : " + i +"-");
      for ( int j = 1 ; j < 8 ; j++ ) {
        System.out.print(" "+j+" ");
      }
      System.out.println();
    }
  }
  public void carreVide(int a){
    for ( int i=0 ; i < a ; i++ ){
      for ( int j = 0 ; j < a ; j++ ) {
        if(i == 0 || i == a-1){
          System.out.print("*");
        }
        else{
          if(j == 0 || j == a-1){
            System.out.print("*");
          }
          else{
            System.out.print(".");
          }
        }
      }
      System.out.println();
    }
  }

  public void triangle(int a){
    for ( int i=0 ; i < a ; i++ ){
      for ( int j = 0 ; j < a ; j++ ) {
        if( j < a-1-i ){
          System.out.print(".");
        }
        else{System.out.print("*");}
      }
      System.out.println();
  }
}

  public static void main (String[] args){
    Scanner scanner = new Scanner( System.in );
    System.out.println("le nb ");
    int nbJour = scanner.nextInt();
    Test truc = new Test();
    //truc.carreVide(nbJour);
    //truc.dessinerCarre(nbJour);
    //truc.triangle(nbJour);
  }
}
