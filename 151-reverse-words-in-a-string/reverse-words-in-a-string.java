import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        String str = "";
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                str += s.charAt(i);
            } else {
                if (!str.equals("")) {
                    st.push(str);
                    str = "";
                }
            }
            i++;
        }
        if (!str.equals("")) {
            st.push(str);
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}