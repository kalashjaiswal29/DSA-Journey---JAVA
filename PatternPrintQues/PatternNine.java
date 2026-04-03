public class PatternNine {
  public static void main(String[] args) {
    int a = 0 , n = 5 , b; 
    for(int j = 1 ; j <= n ; j++ ){
      
      b = a ;
      for(int i = 1 ; i <= j ; i++){
         
        System.out.print(b+" ") ;
        b = 1 - b ;

      }
      System.out.println();
      a = 1 - a ;
    }
  }
}
