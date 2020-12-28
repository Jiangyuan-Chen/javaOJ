import java.util.Scanner;

public class LostNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] nums = new int[number];
        for (int i = 0; i < number; i++){
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < number; i++) {
            if(i != nums[i]){
                System.out.println(i);
                return;
            }
        }
        input.close();
    }
}
