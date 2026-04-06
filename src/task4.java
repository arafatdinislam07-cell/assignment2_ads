import java.util.LinkedList;
import java.util.Queue;

public class task4{

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop() {
            return q1.remove();
        }

        public int top() {
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop()); // 30
        System.out.println(s.top()); // 20
    }
}