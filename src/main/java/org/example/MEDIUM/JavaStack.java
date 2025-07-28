package org.example.MEDIUM;

import java.util.*;

class JavaStack{

    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        while (sc.hasNext()) {
            String input = sc.next();
            boolean isBalanced = true;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[' || c == '{') {
                    stack.add(c);
                } else {
                    if (stack.isEmpty() || stack.pop() != parentheses.get(c)) {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                isBalanced = false;
            }
            System.out.println(isBalanced);
        }

    }
}
