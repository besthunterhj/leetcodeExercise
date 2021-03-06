import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class exercise8
{
    public static void moveZeroes(int[] nums)
    {
        if (nums.length == 0)
            return;

        // 双指针处理
        for (int i = 0, j = 1; j < nums.length;)
        {
            if (nums[i] != 0)
            {
                i++;
                j++;
            }
            else
            {
                if (nums[j] == 0)
                {
                    j++;
                }
                else
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
            }

        }
    }

    public static void main(String[] args)
    {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
