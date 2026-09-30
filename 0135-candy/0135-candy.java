class Solution {
    public int candy(int[] ratings) {
        // int n = ratings.length ;

        // int [] left = new int[n] ;
        // int [] right = new int[n] ;

        // left[0] = 1 ;
        // right[n - 1] = 1 ;

        // for(int i = 1 ; i < n ; i++ ) {
        //     if(ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1 ;
        //     else left[i] = 1 ;
        // }
        // for(int i = n - 2 ; i >= 0 ; i-- ) {
        //     if(ratings[i] > ratings[i + 1]) right[i] = right[i + 1] + 1 ;
        //     else right[i] = 1 ;
        // }

        // int sum = 0 ;
        // for(int i = 0 ; i < n ; i++ ) sum += Math.max(left[i] , right[i] ) ;

        // return sum ;
        // ------------------------------------>
        // int n = ratings.length ;

        // int [] left = new int[n] ;

        // left[0] = 1 ;
        // for(int i = 1 ; i < n ; i++ ) {
        //     if(ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1 ;
        //     else left[i] = 1 ;
        // }
        // int curr = 1 ;
        // int rcurr = 1 ;
        // int sum = Math.max(1 , left[n - 1]) ;

        // for(int i = n - 2 ; i >= 0 ; i-- ) {
        //     if(ratings[i] > ratings[i + 1]) {
        //         curr = rcurr + 1 ;
        //         rcurr = curr ;
        //     }else curr = 1 ;

        //     sum += Math.max(left[i] , curr ) ;
        // }

        // return sum ;

        int n = ratings.length ;

        int sum = 1 ;
        int i = 1 ;

        while(i < n ) {
            if(ratings[i] == ratings[i - 1]) {
                sum++ ;
                i++ ;

                continue ;
            }
            int peak = 1 ;

            while(i < n && ratings[i] > ratings[i - 1]) {
                peak++ ;
                sum += peak ;

                i++ ;
            }
            int down = 0 ;

            while(i < n && ratings[i] < ratings[i - 1]) {
                down++ ;
                sum += down ;
            
                i++ ;
            }

            if(down >= peak ) sum += down - peak + 1 ;
        }
        return sum ;
    }
}