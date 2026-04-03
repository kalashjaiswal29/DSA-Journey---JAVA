public class PatternFive {
  public static void main(String[] args) {
    int n = 6 ;
    for(int j = 1 ; j <= n ; j++){
      for(int i = 0 ; i <= n-j ; i++){
          System.out.print("* ") ;
    }
    System.out.println("");
    }
  }
}
