class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length ;

        int [] sTime = new int [n] ;
        int [] eTime = new int [n] ;

        for(int i = 0 ; i < n ; i++ ) {
            sTime[i] = intervals[i][0] ;
            eTime[i] = intervals[i][1] ;
        }

        Arrays.sort(sTime) ;
        Arrays.sort(eTime) ;

        int ending = 0 ;
        int gcs = 0 ;


        for(int i : sTime ) if(i > eTime[ending]) ending++ ; else gcs++ ;

        return gcs ;
    }
}