import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String values = scanner.nextLine();
            Stack<Character> stack = new Stack();
            boolean isBalance = true;
            for (int i = 0; i < values.length(); i++) {
                char c = values.charAt(i);
                if (c == '(' || c == '{' || c == '[')
                    stack.push(c);
                else if (c == ')' || c == ']' || c == '}') {
                    if (!stack.isEmpty()){
                        char value = stack.pop();
                        if ((c == ')' && value != '(') || (c == ']' && value != '[') || (c == '}' && value != '{')) {
                            isBalance = false;
                            break;
                        }
                    }
                    else {
                        isBalance = false;
                        break;
                    }

                }
            }
            if (!stack.isEmpty())
                isBalance = false;
            System.out.println(isBalance);
        }
    }
}
