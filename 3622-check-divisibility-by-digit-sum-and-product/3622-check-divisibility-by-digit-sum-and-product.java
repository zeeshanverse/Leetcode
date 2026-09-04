class Solution {
    public boolean checkDivisibility(int n) {
        int s = sum(n) ;
        int p = product(n) ;

        if(n % (s + p ) == 0 ) return true ;

        return false ;
    }
    int sum(int n) {
        int sum = 0 ;
        while(n > 0 ) {
            sum += n % 10 ;
            n /= 10 ;
        }

        return sum ;
    }
    int product(int n ) {
        int pro = 1 ;
        while(n > 1 ) {
            pro *= n % 10 ;
            n /= 10 ;
        }

        return pro ;
    }
}