class Solution {
    List<List<Integer>> list = new ArrayList<>() ;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates) ;
        int n = candidates.length ;
    
        solve(0 , candidates , n , target , new ArrayList<>() , 0 ) ;
        return list ;
    }
    
    public void solve(int i , int [] arr , int n , int target , ArrayList<Integer> nums , int sum ) {
        if(sum == target ) {
            list.add(new ArrayList<>(nums)) ;
            return ;
        }

        if(i == n || sum > target ) return ;

        for(int j = i ; j < n ; j++ ) {
            if( j > i && arr[j] == arr[j - 1]) continue ;

            if(sum + arr[j] > target ) break ; 

            nums.add(arr[j]) ;

            solve(j + 1, arr , n , target , nums , sum + arr[j]) ;

            nums.remove(nums.size() - 1) ;
        }
    }

}