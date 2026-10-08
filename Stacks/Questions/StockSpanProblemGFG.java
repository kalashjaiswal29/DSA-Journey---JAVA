class Solution {
    
    public class Pair{
        int val ;
        int idx ;
        
        Pair(int val, int idx){
            this.val = val ;
            this.idx = idx ;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        
        Stack<Pair> st = new Stack<>() ;
        
        ArrayList<Integer> list = new ArrayList<>() ;
        int[] newArr = new int[arr.length] ;
        newArr[0] = 1 ;
        st.push(new Pair(arr[0], 0)) ;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < st.peek().val){ 
                newArr[i] = i - st.peek().idx ;
                st.push(new Pair(arr[i], i)) ;
            }
            else{
                while(st.size() > 0 && arr[i] >= st.peek().val){
                    st.pop() ;
                    
                }if(st.size() == 0){
                    newArr[i] = i - (-1) ;
                    st.push(new Pair(arr[i], i)) ;
                }else{
                newArr[i] = i - st.peek().idx ;
                st.push(new Pair(arr[i], i)) ;
                }
                
            }
        }
        
        for (int i = 0 ; i < arr.length ; i++){
            list.add(newArr[i]) ;
        }
        return list ;
        
    }
}