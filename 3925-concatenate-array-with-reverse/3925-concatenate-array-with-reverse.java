class Solution {
    public int[] concatWithReverse(int[] nums) {
        // int[] reversed = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int [] res = new int[2 * nums.length ] ;

        for(int i = 0 ; i < nums.length ; i++ ) {
            res[i] = nums[i] ;
            res[nums.length * 2 - 1 - i] = nums[i] ;
        }
        return res ;
    }
}