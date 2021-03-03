package primary.array;

import java.util.Arrays;

public class exercise3 {
    // 未完成版
    public void rotate1(int[] nums, int k)
    {
        // 实现swap的中间临时变量
        int temp = 0;


        for (int i = 0; i < nums.length / 2; i++)
        {
            temp = nums[i];

            if (i + k <= nums.length - 1)
            {
                nums[i] = nums[i + k];
                nums[i + k] = temp;
            }
            else
            {
                int target = i + k - nums.length;
                nums[i] = nums[target];
                nums[target] = temp;
            }
        }


    }

    // 完成版
    public static void rotate(int[] nums, int k)
    {
        // 回避当k大于nums.length的情况
        k = k % nums.length;

        int[] resultArray = new int[nums.length];

        System.arraycopy(nums, nums.length - k, resultArray, 0, k);
        System.arraycopy(nums, 0, resultArray, k, nums.length - k);

        System.arraycopy(resultArray, 0, nums, 0, resultArray.length);

    }

    public static void main(String[] args)
    {
        int[] test = {1, 2, 3, 4, 5, 6, 7};

        rotate(test, 3);
    }
}
