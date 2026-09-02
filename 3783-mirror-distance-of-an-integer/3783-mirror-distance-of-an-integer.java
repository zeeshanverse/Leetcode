class Solution {
    public int mirrorDistance(int n) {

        // String s = String.valueOf(n) ;

        // StringBuilder temp = new StringBuilder(s).reverse().toString() ;

        // int rev = Integer.parseInt(temp) ;

        // return rev - n ;

        String s = String.valueOf(n);
        String reversed = new StringBuilder(s).reverse().toString();

        int rev = Integer.parseInt(reversed);
        
        int ans = rev - n;

        return Math.abs(ans) ;
        
    }
}