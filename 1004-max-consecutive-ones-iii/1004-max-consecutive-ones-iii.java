class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max = 0 ;

        // for(int i = 0 ; i < nums.length ; i++ ) {
        //     int zeros = 0 ;

        //     for(int j = i ; j < nums.length ; j++ ) {
        //         if(nums[j] == 0 ) zeros++ ;
        //         if(zeros <= k ) {
        //             int len = j - i + 1 ;
        //             max = Math.max(max , len ) ;
        //         }else break ;
        //     }
        // }
        // return max ;

        //sliding window better app 
        int max = 0 ;
        int left = 0 ;
        int right = 0 ;
        int zeros = 0 ;

        while(right < nums.length ) {
            if(nums[right] == 0 ) zeros++ ;
            if(zeros > k ) {
                if(nums[left] == 0 ) zeros-- ;
                left++ ;
            }
            if(zeros <= k ) {
                int len = right - left + 1 ;
                max = Math.max(len , max ) ;
            }
            right++ ;
        }
        return max ;
    }
}