class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums) ;
        
        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int num : nums ) map.put(num , map.getOrDefault(num , 0 ) + 1 ) ;

        List<Integer> ans = new ArrayList<>() ;
        int start = nums[0] ;
        int end = nums[nums.length - 1 ] ;

        for(int i = start ; i <= end ; i++ ) if(!map.containsKey(i)) ans.add(i) ;

        return ans ;
    }
}