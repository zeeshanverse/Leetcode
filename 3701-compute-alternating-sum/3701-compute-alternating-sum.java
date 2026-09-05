class Solution {
    public int alternatingSum(int[] nums) {
        int evensum = 0 ;

        for(int i = 0 ; i < nums.length ; i += 2 ) evensum += nums[i] ;

        int oddsum = 0 ;

        for(int i = 1 ; i < nums.length ; i += 2 ) oddsum += nums[i] ;

        return evensum - oddsum ;
    }
}