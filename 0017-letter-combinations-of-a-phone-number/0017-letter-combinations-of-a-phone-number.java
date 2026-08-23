class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>() ;
        
        List<String> res = new ArrayList<>() ;

        map.put('2' , "abc") ;
        map.put('3' , "def") ;
        map.put('4' , "ghi") ;
        map.put('5' , "jkl") ;
        map.put('6' , "mno") ;
        map.put('7' , "pqrs") ;
        map.put('8' , "tuv") ;
        map.put('9' , "wxyz") ;

        if(digits.length() == 0 ) res.add("") ;

        StringBuilder temp = new StringBuilder("") ;

        solve(0 , digits , temp , res , map ) ;

        return res ;
    }
    void solve(int idx , String s , StringBuilder temp , List<String> res , HashMap<Character , String> map ) {
        if(idx >= s.length()) {
            res.add(temp.toString()) ;

            return ;
        }
        char ch = s.charAt(idx) ;
        String str = map.get(ch) ;

        for(int i = 0 ; i < str.length() ; i++ ) {
            //do
            temp.append(str.charAt(i)) ;
            //explore
            solve(idx + 1 , s , temp , res , map ) ;
            //undo
            temp.deleteCharAt(temp.length() - 1) ;
        } 
    }
}