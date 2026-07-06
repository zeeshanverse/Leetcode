class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ind = -1 ;
        int maxcount = -1 ;

        for(int i = 0 ; i < mat.length ; i++ ) {
            int countrows = 0 ;
            for(int j = 0 ; j < mat[0].length ; j++ ) {
                countrows += mat[i][j] ;
            }
            if(countrows > maxcount ) {
                maxcount = countrows ;
                ind = i ;
            }
        }
        return new int[]{ind , maxcount} ;
    }
}