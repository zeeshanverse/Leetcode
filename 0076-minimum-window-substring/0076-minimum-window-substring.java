class Solution {
    public String minWindow(String s, String t) {

        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) 
            return new String() ; 

        int [] map = new int[128] ;

        int count = t.length() ;
        int l = 0 ;
        int r = 0 ;
        int minlen = Integer.MAX_VALUE ;
        int sIndex = 0 ;

        for(char c : t.toCharArray()) map[c]++ ;

        char [] ch = s.toCharArray() ;

        while(r < ch.length) {
            if(map[ch[r++]]-- > 0 ) count-- ;
            while(count == 0 ) {
                if(r - l < minlen ) {
                    sIndex = l ;
                    minlen = r - l ;
                }
                if(map[ch[l++]]++ == 0 ) count++ ;
            }
        }

        return minlen == Integer.MAX_VALUE ? new String() : new String(ch , sIndex , minlen) ;
    }
}