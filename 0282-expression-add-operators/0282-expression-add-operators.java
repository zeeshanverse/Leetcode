class Solution {
    List<String> ans = new ArrayList<>() ;
    public List<String> addOperators(String num, int target) {

        solve( 0 , "" , 0 , 0 , num , target )  ;

        return ans ;
    }
    void solve(int idx , String temp , long resSoFar , long prevNum , String str , int target) {
        if(idx == str.length()) {
            if(resSoFar == target ) ans.add(temp) ;

            return ; 
        }

        for(int i = idx  ; i < str.length() ; i++ ) {
            if(i > idx && str.charAt(idx) == '0' ) break ;
            long currNum = Long.parseLong(str.substring(idx , i + 1)) ;
            if(idx == 0 ) solve(i + 1 , temp + currNum , currNum , currNum , str , target) ;
            else{
                solve(i + 1 , temp + "+" + currNum , resSoFar + currNum , currNum , str , target ) ;
                solve(i + 1 , temp + "-" + currNum , resSoFar - currNum , -currNum , str , target ) ;
                solve(i + 1 , temp + "*" + currNum , resSoFar - prevNum + prevNum * currNum , prevNum * currNum , str , target ) ;
            }
        }

    }
}