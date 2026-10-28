/**
 * Given a 2D binary matrix mat[][], where each cell contains either 0 or 1. Find the maximum area of a rectangle that can be formed using only 1's within the matrix.

Examples:

Input: mat[][] = [[0, 1, 1, 0], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 0, 0]]
Output: 8
Explanation: The largest rectangle of 1's highlighted in green, matching the area of 2 * 4 = 8.

 * Solution
 */



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
    public int maxArea(int mat[][]) {
        // code here
        
    // m = number of rows, n = number of columns ;
    int m = mat.length , n = mat[0].length ;
    
    for(int i = 0 ; i < n ; i++){
        for(int j = 1 ; j < m ; j++){
            
            if(mat[j][i] == 1){
                mat[j][i] += mat[j-1][i] ;
            }
            
        }
    }
    
    int maxArea = Integer.MIN_VALUE ;
    
    for(int i = 0 ; i < m ; i++){
        int newArea = getMaxArea(mat[i]) ;
        if(maxArea < newArea) maxArea = newArea ;
    }
    return maxArea ;
        
    }
} 
