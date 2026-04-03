public class PatternTwelve {
  public static void main(String[] args) {
        int n = 6 , a ;
    for(int j = 1 ; j <= n ; j++){
      a = 1 ;
      for(int i = 1 ; i <= n ; i++){
        if((i+j) <= n){
          System.out.print("  ");
        }
        else{
          System.out.print(a+" ");
          a++ ;
        }

    }
    System.out.println();
    }
  }
}
