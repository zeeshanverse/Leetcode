class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "";
        for (String s : word1)
            temp1 += s;

        String temp2 = "";
        for (String ss : word2)
            temp2 += ss;

        return temp1.equals(temp2);
    }
}