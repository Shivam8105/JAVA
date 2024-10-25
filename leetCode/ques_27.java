public class ques_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num != val) {
                nums[count++] = num;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num[] = { 3, 2, 2, 3 };
        int val = 3;
        int result = removeElement(num, val);
        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
