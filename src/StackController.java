import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackController {

    Deque<Integer> stack = new ArrayDeque<>();

    Deque<Integer> stackWithMin = new ArrayDeque<>();

    public void push(Integer number) {
        if (stackWithMin.isEmpty() || number <= peekMin()) {
            stackWithMin.push(number);
        }
        stack.push(number);
    }

    public Integer peekMin() {
        return stackWithMin.peek();
    }

    public void pop() {
        int number = stack.pop();
        if (number == peekMin()) {
            stackWithMin.pop();
        }
    }

}
