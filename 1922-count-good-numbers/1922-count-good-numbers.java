class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007 ;

        long e = (n + 1 ) / 2 ;
        long o = n / 2 ;

        long even = power(5 , e) ;
        long odd = power(4 , o ) ;

        return (int ) ((even * odd ) % mod) ;
        
    }
    long power(long base , long exp ) {
        long mod = 1000000007 ;
        long ans = 1 ;

        while(exp > 0 ) {
            if(exp % 2 == 1 ) ans = (ans * base) % mod ;

            base = (base * base) % mod ;
            exp = exp / 2 ;
        }
        return ans ;
    }
}