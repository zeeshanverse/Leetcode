class Solution {
    List<List<Integer>> list = new ArrayList<>() ;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length ;
    
        solve(0 , candidates , n , target , new ArrayList<>() , 0 ) ;
        return list ;
    }
    
    public void solve(int i , int [] arr , int n , int target , ArrayList<Integer> nums , int sum ) {
        if(i == n ) {
            if(sum == target ) {
                list.add(new ArrayList<>(nums)) ;
                return ;
            }
        }
        if(i == n || sum > target ) return ;
        nums.add(arr[i]) ;
        sum += arr[i] ;

        solve(i , arr , n , target , nums , sum ) ;

        sum -= arr[i] ;
        nums.remove(nums.size() - 1) ;

        solve(i + 1 , arr , n , target , nums , sum ) ;
    }

}