class Solution {
    public int dominantIndex(int[] nums) {
        // Arrays.sort(nums) ;
        int largest = Integer.MIN_VALUE ;
        int secLargest = Integer.MIN_VALUE ;
        int ans = 0 ;

        for(int i = 0 ; i < nums.length ; i++ ) {
            if(nums[i] > largest ) {
                secLargest = largest ;
                largest = nums[i] ;
                ans = i ;  
            }else if(nums[i] < largest && nums[i] > secLargest) secLargest = nums[i] ;
        }
        if(secLargest * 2 <= largest ) return ans ;
        return -1 ;
    }
}