class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>() ;

        String first = "qwertyuiop" ;
        String second = "asdfghjkl" ;
        String third = "zxcvbnm" ;

        for(String i : words ) {
            if(isThere(i , first) || isThere(i , second) || isThere(i , third)) ans.add(i) ;
        }
        return ans.toArray(new String[0]) ;
    }
    boolean isThere(String s , String row ) {
        for(char ch : s.toCharArray()) {
            if(row.indexOf(Character.toLowerCase(ch)) == -1 ) return false ;
        }
        return true ;
    }
}