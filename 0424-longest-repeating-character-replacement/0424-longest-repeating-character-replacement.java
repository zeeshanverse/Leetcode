class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 ;
        int r = 0 ;
        
        int [] freq = new int[26] ;

        int maxlen = 0 ;
        int maxfreq = 0 ;

        while(r < s.length() ) {
            char ch = s.charAt(r) ;
            freq[ch - 'A']++ ;

            maxfreq = Math.max(maxfreq , freq[ch - 'A']) ;

            if((r - l + 1) - maxfreq > k ) {
                freq[s.charAt(l) - 'A']-- ;
                l++ ;
            }

            maxlen = Math.max(maxlen , (r - l + 1 )) ;

            r++ ;
        }

        return maxlen ;
    }
}