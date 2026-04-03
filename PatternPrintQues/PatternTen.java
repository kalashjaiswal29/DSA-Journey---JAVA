public class PatternTen {
  public static void main(String[] args) {
    int n = 6 ;
    for(int j = 1 ; j <= n ; j++ ){
        for(int i = 1 ; i <= n+5-j ; i++){
          if(i < n + 1 - j){
            System.out.print("  ");
          }
          else{
            System.out.print("* ");
          }
        }System.out.println();
    }
  }
}
