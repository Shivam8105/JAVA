package leetCode;
import java.util.*;
public class ques_1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr,9);
        System.out.println(Arrays.toString(result));
        in.close();
    }
}
