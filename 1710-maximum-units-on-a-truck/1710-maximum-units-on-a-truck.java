class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]) ;
        // int n = boxTypes.length;
        int size = truckSize ;
        int units = 0 ;

        for(int i = 0 ; i < boxTypes.length ; i++ ) {
            if(boxTypes[i][0] <= size ) {
                size = size - boxTypes[i][0] ;
                units += boxTypes[i][0] * boxTypes[i][1] ;
            }
            else {
                units += boxTypes[i][1] * size ;
                break ;
            }
        }
        return units ;
    }
}