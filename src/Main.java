public class Main {
    public static void main(String[] args) {
        StackController stackController = new StackController();

        stackController.push(8);
        stackController.push(2);
        stackController.push(5);
        stackController.push(7);
        System.out.println(stackController.stack);
        System.out.println(stackController.peekMin());
        stackController.pop();
        System.out.println(stackController.stack);
        System.out.println(stackController.peekMin());
    }
}
