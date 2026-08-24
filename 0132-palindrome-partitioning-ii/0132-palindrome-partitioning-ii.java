class Solution {
    public int minCut(String s) {

        int [] dp = new int[s.length()] ;
        // because is 4 length 3 will be parttions --> so n - 1 if n is length
        Arrays.fill(dp , -1) ;

        int res = solve(0 , s , dp) - 1 ;

        return res ;
    }
    int solve(int ind , String s , int[] dp ){
        if(ind == s.length()) return 0 ;

        // String temp = "" ;
        int minPart = Integer.MAX_VALUE ;

        if(dp[ind] != -1 ) return dp[ind] ;

        for(int i = ind ; i < s.length() ; i++ ) {
            // temp += s.charAt(i) ;
            if(isPal(s , ind , i)) {
                int part = 1 + solve(i + 1 , s , dp) ;

                minPart = Math.min(minPart , part) ;
            }
        }

        return dp[ind] = minPart ;
    } 
    boolean isPal(String s , int start , int end ) {
        while(start <= end ) {
            if(s.charAt(start++) != s.charAt(end-- )) return false ;
        }
        return true ;
    }
}