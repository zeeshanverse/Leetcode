class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>() ;

        for (int num : nums ) {
            String s = String.valueOf(num) ;

            for (char c : s.toCharArray()) ans.add(c - '0') ;
        }

        int[] arr = new int[ans.size()] ;

        for (int i = 0 ; i < ans.size() ; i++) arr[i] = ans.get(i) ;

        return arr ;
    }
}