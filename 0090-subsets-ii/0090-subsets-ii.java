class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;

        List<List<Integer>> ans = new ArrayList<>() ;

        List<Integer> list = new ArrayList<>() ;

        solve(0 , nums , list , ans ) ;

        return ans ;
    }

    void solve(int i , int [] arr , List<Integer> list , List<List<Integer>> ans ) {
        if(i == arr.length ) {
            ans.add(new ArrayList<>(list)) ;

            return ;
        }

        list.add(arr[i]) ;

        solve(i + 1 , arr , list , ans ) ;
        list.remove(list.size() - 1 ) ;

        int j = i + 1 ;

        while(j < arr.length && arr[j] == arr[i]) j++ ;

        solve(j , arr , list , ans ) ;
    }
}