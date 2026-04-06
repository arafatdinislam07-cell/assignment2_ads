import java.util.Stack;

public class task3 {

    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int cur = stack.pop();

            while (!temp.isEmpty() && temp.peek() > cur) {
                stack.push(temp.pop());
            }
            temp.push(cur);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(7);
        s.push(2);

        System.out.println(sort(s));
    }
}