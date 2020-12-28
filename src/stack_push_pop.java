import java.util.Scanner;
import java.util.Stack;


public class stack_push_pop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] pushSequence = new int[num];
        int[] popSequence = new int[num];
        for (int i = 0; i < num; i++) {
            pushSequence[i] = input.nextInt();
        }
        for (int i = 0; i < num; i++) {
            popSequence[i] = input.nextInt();
        }
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while (popIndex < n && !stack.isEmpty() && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        System.out.println(stack.isEmpty());
        input.close();
    }
}
