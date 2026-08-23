class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>() ;

        List<Integer > list = new ArrayList<>() ;

        solve(1 , k , n , list , ans ) ;

        return ans ;

    }
    void solve(int i , int size , int target , List<Integer> list , List<List<Integer>> ans) {
        if(list.size() == size ) {
            if(target == 0 ) ans.add(new ArrayList<>(list)) ;

            return ;
        }

        if(i > 9 ) return ;
        
        list.add(i) ;
        solve(i + 1 , size , target - i , list , ans ) ;

        list.remove(list.size() - 1) ;
        solve(i + 1 , size , target , list , ans ) ;
    }
}