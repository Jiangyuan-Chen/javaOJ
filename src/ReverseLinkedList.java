import java.util.Scanner;


public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int n= input.nextInt();
        int[] nums=new int[n];
        for (i=0; i<n; i++){
            nums[i]= input.nextInt();
        }
        input.close();
        for (i=n-1; i>=0; i--){
            System.out.println(nums[i]);
        }
        input.close();
    }
}
