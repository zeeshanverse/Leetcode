class Solution {
    List<String> ans = new ArrayList<>() ;
    public List<String> generateParenthesis(int n) {
        StringBuilder curr = new StringBuilder("") ;

        int open = 0 ;
        int close = 0 ;

        solve(curr , n , open , close ) ;

        return ans ;
    }

    void solve(StringBuilder s , int n, int open , int close  ) {
        if(s.length() == 2 * n ) {
            ans.add(s.toString()) ;
            return ;
        }

        if(open < n ){
            s.append("(") ;
            solve(s , n , open + 1 , close ) ;
            s.deleteCharAt(s.length() - 1 ) ;
        }

        if(close < open ) {
            s.append(")") ;
            solve(s , n , open , close + 1 ) ;
            s.deleteCharAt(s.length() - 1 ) ;
        }
    }

    // boolean isValid(StringBuilder str ) {
    //     int count = 0 ;

    //     for(int i = 0 ; i < str.length() ; i++ ) {
    //         if(str.charAt(i)== '(') count++ ;
    //         else count-- ;

    //         if(count < 0 ) return false ;
    //     }
    //     return count == 0 ;
    // }
}