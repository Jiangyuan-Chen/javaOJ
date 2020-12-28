import java.util.Scanner;

public class test {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] nums = new int[number];
        for (int i = 0; i < number; i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            for (int j = i+1; j < nums.length; j++){
                if (difference == nums[j]){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        input.close();
    }

}