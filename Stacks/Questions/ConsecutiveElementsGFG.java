import java.util.Stack ;

class Solution {
    public String removeDuplicates(String s) {
        // code here
        Stack <Character> st = new Stack<>() ;

        int i = 0 ;
        while(i < s.length()){
            char ch = s.charAt(i) ;
            
            if(st.size() == 0) st.push(ch) ;
            else{
                if(ch != st.peek()){
                    st.push(ch) ;
                }
            }
            
            
            
            
            i++ ;
        }
        
        // making a new string and conacteneting each letter at before hits the tle error so we made the char array and converted it to string
        
        char[] ch = new char[st.size()] ;
        
        for(int j = st.size() - 1 ; j >= 0 ; j--){
            ch[j] = st.pop() ;
        }
        return new String(ch) ;
    }
}