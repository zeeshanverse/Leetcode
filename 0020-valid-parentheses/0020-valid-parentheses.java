class Solution {
    public boolean isValid(String s) {

        char[] st = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st[++top] = ch;
            } else {

                if (top == -1)
                    return false;

                char open = st[top--];

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '['))
                    return false;
            }
        }

        return top == -1;
    }
}