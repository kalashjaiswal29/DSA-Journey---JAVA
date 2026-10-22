class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
               Stack<Integer> st = new Stack<>() ;

               int n = arr.length ;
               int[] nse = new int[n] ; 

               nse[n-1] = n ;
               st.push(n-1) ;
               for(int i = n-2 ; i >= 0 ; i-- ){
                   while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                       st.pop() ;
                   }
                   if(st.size() == 0) nse[i] = n ;
                   else{
                       nse[i] = st.peek() ;
                   }
                   st.push(i) ;

               }


               // prev smaller element
               while(st.size()>0) st.pop() ;

               int[] pse = new int[n] ; 

               pse[0] = -1 ;
               st.push(0) ;
               for(int i = 1 ; i <= n-1 ; i++ ){
                   while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                       st.pop() ;
                   }
                   if(st.size() == 0) pse[i] = -1 ;
                   else{
                       pse[i] = st.peek() ;
                   }
                   st.push(i) ;

               }


        int maxArea = Integer.MIN_VALUE ;

               for(int i = 0 ; i <= n-1 ; i++){
                   int area = arr[i]*(nse[i] - pse[i]-1) ;
                   maxArea = Math.max(area, maxArea) ;
               }
               return maxArea ;
    }
}
