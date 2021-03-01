import java.util.Arrays;

public class exercise5
{
    public static int singleNumber(int[] nums)
    {
//        第一次用的是排序，效果不佳
//        if ((nums.length % 2) != 1)
//            return 0;
//
//        else
//        {
//            // 由于除了一个数字是单独出现的，其余的都出现了两次
//            Arrays.sort(nums);
//
//            for (int i = 0; i < nums.length - 1; i += 2)
//            {
//                if (nums[i] != nums[i + 1])
//                {
//                    return nums[i];
//                }
//            }
//        }
//
//        return nums[nums.length - 1];

        // 更优的解决思路 —— 使用异或运算
        int target = 0;

        for (int i = 0; i < nums.length; i++)
        {
            // 异或和赋值联合的二元运算符 ^=
            target ^= nums[i];
        }

        return target;
    }

    public static void main(String[] args) {
        int[] array = {5,5,4,4,9,1,1,3,3,6,6};

        System.out.println(singleNumber(array));
    }
}
