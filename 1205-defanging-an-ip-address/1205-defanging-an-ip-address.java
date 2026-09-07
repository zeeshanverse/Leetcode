class Solution {
    public String defangIPaddr(String address) {
        StringBuilder temp = new StringBuilder("") ;

        for(int i = 0 ; i < address.length() ; i++ ) if(address.charAt(i) == '.') temp.append("[.]") ; else temp.append(address.charAt(i)) ;

        return temp.toString() ;
    }
}