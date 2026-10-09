class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat[0].length ;  // length of 2d sqare matrix 
        Stack<Integer> st = new Stack<>() ;
        
        for(int i = 0 ; i < n ; i++){
            st.push(i) ;
        }
        
        while(st.size() > 1){
            int i = st.pop() ;
            int j = st.pop() ;
            
            boolean iFlag = true , jFlag = true ; // true matalb wapas daalenge
            if(mat[i][j] == 1){  //i celeb nhi h 
                iFlag = false ;
            } 
            else{  // j celeb nhi h 
                jFlag = false ;
            }
            if(mat[j][i] == 1){ // j celeb nhi h 
                jFlag = false ;
            }else{ // i celeb nhi h 
                iFlag = false ;
            }
            
            if(iFlag) st.push(i);
            if(jFlag) st.push(j);
        }
        
        
        if(st.size() == 0){
            return -1 ;
        }
        
        
        
            int peek = st.pop() ;
            for(int i = 0 ; i < n  ; i++){
                if(i == peek) continue ;
                if(mat[peek][i] != 0){
                    return -1 ;
                }
                else if(mat[i][peek] != 1){
                    return -1 ;
                }
            }
        
        
        return peek ;
        
        
        
    }
}