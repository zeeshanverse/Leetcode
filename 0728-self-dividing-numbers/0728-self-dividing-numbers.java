class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer> ans = new ArrayList<>() ;
        for(int i = left ; i <= right ; i++ ){
            if(possible(i)) ans.add(i) ;
        }
        return ans ;
    }

    boolean possible(int num ) {
        int org = num ;
        while(num > 0 ) {
            int digit = num % 10 ;
            if(digit == 0 || org % digit != 0  ) return false ;
            num /= 10 ;
        }
        return true ;

    }

    
}