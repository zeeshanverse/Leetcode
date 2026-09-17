class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder(s.substring(0 , k)) ;
        str.reverse() ;

        return str.toString() + s.substring(k) ;

        
    }
}