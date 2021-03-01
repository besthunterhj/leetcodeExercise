import java.util.HashSet;
import java.util.Set;

public class exercise4
{
    public static boolean containsDuplicate(int[] nums)
    {
        // time-limitation warning
//        if (nums.length == 0)
//            return false;
//
//        for (int i = 0; i < nums.length - 1; i++)
//        {
//            for (int j = i + 1; j < nums.length; j++)
//            {
//                if (nums[i] == nums[j])
//                {
//                    return true;
//                }
//            }
//        }
//        return false;

        // try java data structure -> set
        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums)
        {
            numsSet.add(num);
        }

        // 比较数组的长度和Set的长度可以得知数组有无重复项
        if (numsSet.size() != nums.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4};
        boolean test = containsDuplicate(array);

        System.out.println(test);
    }
}
