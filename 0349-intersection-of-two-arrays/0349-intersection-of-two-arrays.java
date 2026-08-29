class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>() ;

        int [] ans = new int[Math.min(nums1.length , nums2.length)] ;

        int k = 0 ;
        
        for(int x : nums1 ) set.add(x) ;

        for(int i = 0 ; i < nums2.length ; i++ ) {
            if(set.contains(nums2[i])) {
                ans[k++] = nums2[i] ;
                set.remove(nums2[i]) ;
            }
        }
        return Arrays.copyOf(ans , k) ;
    }
}