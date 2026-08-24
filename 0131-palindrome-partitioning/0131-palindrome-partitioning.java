class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>() ;

        List<String> temp = new ArrayList<>() ;

        solve(0 , s , temp , ans ) ;

        return ans ;
    }
    void solve(int ind , String s , List<String> temp , List<List<String>> ans ){
        if(ind == s.length()){
            ans.add(new ArrayList<>(temp)) ;

            return ;
        }

        for(int i = ind ; i < s.length() ; i++ ) {
            if(isPal(s , ind , i )){
                temp.add(s.substring(ind , i + 1)) ;
                solve(i + 1 , s , temp , ans ) ;
                temp.remove(temp.size() - 1 ) ;
            }
        }
    }

    boolean isPal(String s , int start , int end ) {
        while(start <= end ) {
            if(s.charAt(start++) != s.charAt(end--)) return false ;
        }
        return true ; 
    }
}