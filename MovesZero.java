import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int index = 0;

         Move all non-zero elements to the front
        for (int num  nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

         Fill remaining positions with zeroes
        while (index  nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 5, 0, 8};

        System.out.println(Original Array  + Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println(After Moving Zeroes  + Arrays.toString(nums));
    }
}