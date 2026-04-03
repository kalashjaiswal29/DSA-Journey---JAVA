public class PatternEleven {
  public static void main(String[] args) {
    int n = 40 ;
    for(int j = 1 ; j <= n ; j++){
      for(int i = 1 ; i <= n ; i++){
        if((i+j) <= n){
          System.out.print("  ");
        }
        else{
          System.out.print("* ");
        }
    }
    System.out.println();
    }
  }
}
