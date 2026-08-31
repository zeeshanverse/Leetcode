class Solution {
    public int hammingWeight(int n) {
        StringBuilder res = new StringBuilder("") ;
        
        if (n == 0) return 0 ;

        while(n != 0 ) {
            if(n % 2 == 1 ) res.append('1') ;
            else res.append('0') ;
            
            n = n / 2 ;
        }
        String temp = res.reverse().toString() ;

        int count = 0 ;
        
        for(int i = 0 ; i < temp.length() ; i++ ) {
            if(temp.charAt(i) == '1') count++ ;
        }
        return count ;
    }
}