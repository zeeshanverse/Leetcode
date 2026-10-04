class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap<>() ;

        int l = 0 ;
        int r = 0 ; 
        int max = 0 ;

        while(r < fruits.length ) {
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0 ) + 1) ;

            while(map.size() >= 3 ) {
                map.put(fruits[l] , map.get(fruits[l]) - 1) ;
                if(map.get(fruits[l]) == 0 ) map.remove(fruits[l]) ;

                l++ ;
            }

            int len = r - l + 1 ;
            max = Math.max(max , len ) ;

            r++ ;
        }

        return max ;
    }
}