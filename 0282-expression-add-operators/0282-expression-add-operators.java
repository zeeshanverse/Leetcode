class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>() ;
        
        solve( 0 , "" , 0 , 0 , num , ans , target )  ;

        return ans ;
    }
    void solve(int idx , String temp , long resSoFar , long prevNum , String str , List<String> ans , int      target) {
        if(idx == str.length()) {
            if(resSoFar == target ) ans.add(temp) ;

            return ; 
        }

        for(int i = idx  ; i < str.length() ; i++ ) {
            if(i > idx && str.charAt(idx) == '0' ) break ;
            long currNum = Long.parseLong(str.substring(idx , i + 1)) ;
            if(idx == 0 ) solve(i + 1 , temp + currNum , currNum , currNum , str , ans , target) ;
            else{
                solve(i + 1 , temp + "+" + currNum , resSoFar + currNum , currNum , str , ans , target ) ;
                solve(i + 1 , temp + "-" + currNum , resSoFar - currNum , -currNum , str , ans , target ) ;
                solve(i + 1 , temp + "*" + currNum , resSoFar - prevNum + prevNum * currNum , prevNum * currNum , str , ans , target ) ;
            }
        }

    }
}