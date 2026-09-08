class Solution {
    public int countDigits(int num) {
        int count = 0 ;
        int org = num ;

        while(org > 0 ) {
            if(num % (org % 10) == 0 ) count++ ;
            org /= 10 ;
        }

        return count ;
    }
}