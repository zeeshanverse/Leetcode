class Solution {
    public boolean checkValidString(String s) {
        int n = s.length() ;

        Boolean [][] dp = new Boolean[n][n + 1] ;

        return solve(s , 0 , 0 , dp ) ;
    }

    boolean solve(String s , int i , int count , Boolean [][] dp ) {
        if(count < 0 ) return false ;

        if(i == s.length() ) return count == 0 ;

        if(dp[i][count] != null ) return dp[i][count] ;
        boolean ans ;

        if(s.charAt(i) == '(') ans = solve(s , i + 1 , count + 1 , dp ) ;
        else if(s.charAt(i) == ')') ans = solve(s , i + 1 , count - 1 , dp ) ;
        else ans = solve(s , i + 1 , count + 1 , dp ) || solve(s , i + 1 , count - 1 , dp ) || solve(s , i + 1 , count , dp ) ;

        return dp[i][count] = ans ;
    }
}