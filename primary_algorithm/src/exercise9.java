import java.util.Arrays;
import java.util.HashMap;

public class exercise9
{
    public static int[] twoSum(int[] nums, int target)
    {
        // 定义一个哈希表
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        // 定义两个整数类型存放需要找到的两个元素的下标值
        int index1 = 0, index2 = 0;

        // 遍历数组，如果target - 当前的nums[i]不存在于哈希表中，那么当前的nums[i]存到哈希表中，待下一个循环使用
        // 如果target与当前遍历的nums[i]的差值恰好能够在哈希表中找到，那么就取出当前的i与能够找到的那个元素的key值
        for (int i = 0; i < nums.length; i++)
        {
            if (!numMap.containsKey(target - nums[i]))
            {
                numMap.put(nums[i], i);
            }
            else
            {
                index1 = i;
                index2 = numMap.get(target - nums[i]);
                break;
            }
        }

        int[] result = {index1, index2};
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 7, 11, 15};
        int[] test = twoSum(nums, 13);

        System.out.println(Arrays.toString(test));
    }
}
