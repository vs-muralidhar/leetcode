public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> bracesMapping = new HashMap<>();
        bracesMapping.put('(', ')');
        bracesMapping.put('{', '}');
        bracesMapping.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char popedValue = stack.pop();
                if (bracesMapping.get(popedValue) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}