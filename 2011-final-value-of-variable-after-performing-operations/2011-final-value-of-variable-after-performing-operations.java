class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0 ;

        for(String s : operations ) {
            if(s.startsWith("++") || s.endsWith("++")) x++ ;
            else x-- ;
        }
        return x ;
    }
}