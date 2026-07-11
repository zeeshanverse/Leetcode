class Solution {
    public boolean isValid(String s) {

        while (true) {
            String temp = s.replace("()", "")
                           .replace("{}", "")
                           .replace("[]", "");

            if (temp.equals(s))
                break;

            s = temp;
        }

        return s.isEmpty();
    }
}