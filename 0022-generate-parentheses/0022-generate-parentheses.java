class Solution {
    List<String> ans = new ArrayList<>() ;
    public List<String> generateParenthesis(int n) {
        StringBuilder curr = new StringBuilder("") ;

        solve(curr , n ) ;

        return ans ;
    }

    void solve(StringBuilder s , int n ) {
        if(s.length() == 2 * n ) {
            if(isValid(s)) ans.add(s.toString()) ;

            return ;
        }

        s.append("(") ;
        solve(s , n ) ;
        s.deleteCharAt(s.length() - 1 ) ;

        s.append(")") ;
        solve(s , n ) ;
        s.deleteCharAt(s.length() - 1 ) ;

    }

    boolean isValid(StringBuilder str ) {
        int count = 0 ;

        for(int i = 0 ; i < str.length() ; i++ ) {
            if(str.charAt(i)== '(') count++ ;
            else count-- ;

            if(count < 0 ) return false ;
        }
        return count == 0 ;
    }
}