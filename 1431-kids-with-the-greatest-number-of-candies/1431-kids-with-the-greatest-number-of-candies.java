class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Arrays.sort(candies) ;

        int max = Integer.MIN_VALUE ;

        for(int num : candies ) max = Math.max(num , max) ;

        List<Boolean> ans = new ArrayList<>() ;

        for(int i = 0 ; i < candies.length ; i++ ) {
            if(candies[i] + extraCandies >= max) ans.add(true) ;
            if(candies[i] + extraCandies < max) ans.add(false) ;
        }

        return ans ;
    }
}