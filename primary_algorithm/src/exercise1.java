package primary.array;

public class exercise1
{
    public int removeDuplicates(int[] nums)
    {
        if (nums.length == 0)
            return 0;

        // 定义一个慢指针
        int i = 0;

        // 定义j为快指针
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[i] != nums[j])
            {
                // 遇到两个大小不同的元素（由于是排好序的数组，实际上是后者大于前者），则慢指针向前移动
                i++;

                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
