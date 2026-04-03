public class PatternSix {
  public static void main(String[] args) {
    int n = 7 ;
    for(int j = 1 ; j <= n ; j++){
      if(j==1 || j==n){
        for(int i = 1 ; i <= 7 ; i++){
          System.out.print("* ");
        }
      }else{
        for(int i = 1 ; i <= 7 ; i++){
          if (i == 1 || i == 7) {
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
          
        }
      }
      System.out.println("");
    }
  }
}
