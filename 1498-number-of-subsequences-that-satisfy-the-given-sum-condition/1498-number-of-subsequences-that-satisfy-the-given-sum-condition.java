class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007 ;
        long ans = 0 ;

        Arrays.sort(nums) ;

        int n = nums.length ;

        long[] powers = new long[n] ;
        powers[0] = 1 ;
        for(int i = 1 ; i < n ; i++ ){
            powers[i] = (powers[i - 1 ] * 2 ) % mod ;
        }

        int left = 0 ;
        int right = n - 1 ;

        while(left <= right ) {
            if(nums[left] + nums[right] <= target ) {
                ans = (ans + powers[right - left ]) % mod ;

                left++;
            }else right-- ;
        }

        return (int) ans ;

    }
}