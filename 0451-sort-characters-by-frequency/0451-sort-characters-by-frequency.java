class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>() ;


        for(char ch : s.toCharArray() ) {
            map.put(ch , map.getOrDefault(ch , 0 ) + 1 ) ;
        }
        List<Map.Entry<Character , Integer>> list = new ArrayList<>(map.entrySet()) ;

        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder ans = new StringBuilder() ;

        for(Map.Entry<Character , Integer> entry : list ) {
            for(int i = 0 ; i < entry.getValue() ; i++ ){
                ans.append(entry.getKey()) ;
            }
        }
        return ans.toString() ;
    }
}