class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        Stack<Integer> st = new Stack<>() ;
        int n = arr.length ;
        int[] arr1 = new int[n] ;
    arr1[n-1] = 0 ;
    st.push(arr[n-1]) ;
        for (int i = n-2 ; i >= 0 ; i--){
                int count = 0 ;
                while(st.size() > 0 && st.peek() <= arr[i]){
                    st.pop() ;
                    count++ ;

                }
                if(st.size() > 0 && st.peek() > arr[i]){
                    count++ ;
                }
                arr1[i] = count ;
                st.push(arr[i]) ;


                

            
        }return arr1 ;
    }
}