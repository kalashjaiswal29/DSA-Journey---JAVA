public class PatternSeven {
  public static void main(String[] args) {
    int n = 5 ; // i must be odd
    for(int j = 1 ; j <= n ; j++){
      for(int i = 1 ; i <= n ; i++){
        if(i == (n/2)+1 || j == (n/2)+1){
          System.out.print("* ");
        }
        else System.out.print ("  ");
        
      }
      System.out.println("");
    }
}}
